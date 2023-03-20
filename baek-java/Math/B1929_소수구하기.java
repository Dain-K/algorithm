package Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B1929_소수구하기 {
	static int M, N;
	static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		prime = new boolean[N + 1];
		get_prime();
		for(int i = M; i <= N; i++) {
			if(!prime[i]) System.out.println(i);
		}
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
		for(int i = 2; i <= Math.sqrt(N); i++) {
			if(prime[i]) continue;
			for(int j = i * i; j <= N; j += i) {
				prime[j] = true;
			}
		}
	}
}