package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B1182_부분수열의합 {
	static int N, S;
	static int[] arr;
	static int count = 0;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		visited = new boolean[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		bfs(0,0);
		if(S == 0) count--; // 공집합도 카운트 되므로 제외
		System.out.println(count);
	}
	public static void bfs(int cnt, int sum) {
		if(cnt == N) {
			if(sum == S) count++;
			return;
		}
		bfs(cnt + 1, sum + arr[cnt]); // 현재 원소를 합하는 경우
		bfs(cnt + 1, sum); // 현재 원소를 합하지 않는 경우
				
	}
}
