package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class B10974_모든순열 {
	static int N;
	static int[] arr, num;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		num = new int[N];
		visited = new boolean[N];
		for(int i = 1; i < N + 1; i++) arr[i - 1] = i;
		permutation(0);
		System.out.print(sb.toString());
	}
	public static void permutation(int cnt ) {
		if(cnt == N) {
			for(int n: num) sb.append(n + " ");
			sb.append("\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			num[cnt] = arr[i];
			permutation(cnt + 1);
			visited[i] = false;
		}
	}
}
