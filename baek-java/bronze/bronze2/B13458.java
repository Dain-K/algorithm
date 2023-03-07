package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13458 {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// i 번째 시험장에 있는 응시자 수 A
		// 총감독관이 감시할 수 있는 응시자 수 B
		// 부감독관이 감시할 수 있는 응시자 수 C
		
		int N = Integer.parseInt(br.readLine()); // 시험장의 개수 (1<=N<=1,000,000)
		int[] people = new int[N];
		long pNum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			people[i] = Integer.parseInt(st.nextToken());
		}
		StringTokenizer bc = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(bc.nextToken());
		int C = Integer.parseInt(bc.nextToken());
		
		for(int i = 0; i < N; i++) {
			if(people[i] < B) { // 총감독이 다 감시할 수 있는 경우
				pNum++;
			} else {
				people[i] -= B;
				pNum++;
				pNum += people[i] / C ;
				if(people[i] % C != 0) pNum++;
			}
		}
		System.out.println(pNum);
	}
	
}
