package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839_설탕배달 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int count = 0;
		while(N > 0) {
			if(N % 5 != 0) {
				N -= 3;
				count++;
			}else {
				count += N / 5;
				N = N % 5;
			}
		}
		if(N < 0) System.out.println(-1);
		else System.out.println(count);
	}

}
