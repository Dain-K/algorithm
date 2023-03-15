package Backtracking.Baek15656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Main {
	static int N, M;
	static int[] arr;
	static int[] num; 
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N]; // 저장된 배열
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		num = new int[M];
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		dfs(0, sb);
		System.out.println(sb.toString());
	}
	public static void dfs(int cnt, StringBuilder sb) {
		if(cnt == M) {
			for(int i: num) sb.append(i + " ");
			sb.append("\n");
			return;
		}
		for(int i = 0; i < N; i++) {
			num[cnt] = arr[i];
			dfs(cnt + 1, sb);
		}
	}
}
