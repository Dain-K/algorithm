package bronze.bronze2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1075 {	
	public static void main(String[] args) throws IOException {		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());	
		N = N - N % 100;
		int result = 0;	
		for(int i = 0; i < 100; i++) {
			if((N + i) % F == 0) {
				result = i;
				break;
			}
		}	
		System.out.format("%02d", result);	
	}
}
