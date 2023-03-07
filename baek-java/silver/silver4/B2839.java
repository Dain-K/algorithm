package silver.silver4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2839 {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int total = 0;
		while(N > 0) {
			if(N % 5 != 0) {
				N -= 3;
				total++;
			} else {
				total += N / 5;
				N = N % 5;
			}
		}
		if(N == 0) System.out.println(total);
		else System.out.println(-1);
	}
	
}
