package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B15663_N과M9 {
	static int N, M;
	static int[] arr;
	static int[] num;
	static boolean[] visited;
	static HashSet<String> set = new HashSet<>();
	static StringBuilder sb = new StringBuilder();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		arr = new int[N];
		num = new int[M];
		visited = new boolean[N];
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		permutation(0);
		System.out.print(sb.toString());
	}
	public static void permutation(int cnt) {
		if(cnt == M) {
			StringBuilder sb2 = new StringBuilder();
			for(int n: num) sb2.append(n + " ");
			if(!set.contains(sb2.toString())) {
				sb.append(sb2.toString()).append("\n");
				set.add(sb2.toString());
			}
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
