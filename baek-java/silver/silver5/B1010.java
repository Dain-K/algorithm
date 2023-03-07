package silver.silver5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1010 {
	
	public static int[][] dp = new int[30][30];
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			
			combination(M, N);
			
			System.out.println(dp[M][N]);
			
		}
	}
	// nCr = n-1Cr-1 + n-1Cr
	public static int combination(int n, int r) {

		if(dp[n][r] > 0) return dp[n][r];
		if(r == 0 || r == n) return dp[n][r] = 1;
		else return dp[n][r] = combination(n - 1, r) + combination(n - 1, r - 1);

	}
	
}
