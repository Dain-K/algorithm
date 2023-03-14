package Backtracking.Baek15655;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	static int N, M;
	static int[] num;
	static int[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		num = new int[M];
		visited = new boolean[N];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		permutation(0, 0);
	}
	public static void permutation(int start, int cnt) {
		if(cnt == M) {
			for(int i: num) System.out.print(i + " ");
			System.out.println();
			return;
		}
		for(int i = start; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				num[cnt] = arr[i];
				permutation(i + 1, cnt + 1);
				visited[i] = false;
			}
		}
	}
}