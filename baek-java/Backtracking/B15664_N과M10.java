package Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.StringTokenizer;

public class B15664_N과M10 {
	static int N, M;
	static int[] arr;
	static int[] num;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();
	static HashSet<String> set = new HashSet<>();
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
		System.out.println(sb.toString());
	}
	public static void permutation(int cnt, int start) {
		if(cnt == M) {
			StringBuilder sb2 = new StringBuilder();
			for(int n: num) sb2.append(n + " ");
			if(!set.contains(sb2.toString())) {
				set.add(sb2.toString());
				sb.append(sb2.toString()).append("\n");
			}
			return;
		}
		for(int i = start; i < N; i++) {
			if(visited[i]) continue;
			visited[i] = true;
			num[cnt] = arr[i];
			permutation(cnt + 1, i);
			visited[i] = false;
		}
	}
}
