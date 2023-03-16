package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1931_회의실배정 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] time = new int[N][2];
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			time[i][0] = Integer.parseInt(st.nextToken());
			time[i][1] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(time, (o1, o2) -> { // 종료시간 기준으로 정렬
			if(o1[1] == o2[1]) return o1[0] - o2[0]; // 종료시간이 같을 경우
			return o1[1] - o2[1];
		});
		int count = 0;
		int end = 0;
		for(int i = 0; i < N; i++) {
			if(time[i][0] >= end) {
				end = time[i][1];
				count++;
			}
			
		}
		System.out.println(count);
	}
}