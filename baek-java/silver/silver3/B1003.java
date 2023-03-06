package silver.silver3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1003 {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		long[] dp = new long[41];
		dp[1] = 1;
		for(int i = 2; i < 41; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		
		for(int i = 0; i < T; i++) {
			int N = Integer.parseInt(br.readLine()); // 40보다 작은 수
			if(N == 0) System.out.print(1 + " " + 0 + "\n");
			else System.out.print(dp[N - 1] + " " + dp[N] + "\n");
		}
		

	}
	
}
