package Backtracking;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B15657_N과M8 {
	static int N, M;
	static int[] arr;
	static int[] num;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		num = new int[M];
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		combination(0, 0, sb);
		System.out.println(sb.toString());
	}
	public static void combination(int cnt, int start, StringBuilder sb) {
		if(cnt == M) {
			for(int i: num) sb.append(i + " ");
			sb.append("\n");
			return;
		}
		for(int i = start; i < N; i++) {
			num[cnt] = arr[i];
			combination(cnt + 1, i, sb);
		}
	}

}

