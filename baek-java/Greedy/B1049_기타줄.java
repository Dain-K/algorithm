package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class B1049_기타줄 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 끊어진 기타줄
		int M = Integer.parseInt(st.nextToken()); // 기타줄 브랜드 개수
		int[] pack = new int[M];
		int[] unit = new int[M];
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			pack[i] = Integer.parseInt(st.nextToken());
			unit[i] = Integer.parseInt(st.nextToken());	
		}
		Arrays.sort(pack);
		Arrays.sort(unit);
		int result = 0;
		result = Math.min(((N / 6) + 1) * pack[0], N * unit[0]);
		result = Math.min((N/6) * pack[0] + (N%6) * unit[0], result);
		System.out.println(result);
	}
}