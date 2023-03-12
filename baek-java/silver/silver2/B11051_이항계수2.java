package silver.silver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11051_이항계수2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int[][] Triangle = new int[N + 1][N + 1];
		for(int i = 0; i < N + 1; i++) {
			for(int j = 0; j <= i; j++) {
				if(i==j || j == 0) Triangle[i][j] = 1;
				else Triangle[i][j] = (Triangle[i-1][j-1] + Triangle[i-1][j]) % 10007;
			}
		}
		System.out.println(Triangle[N][K]);
	}

}
