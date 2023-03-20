package Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B2960_에라토스테네스의체 {
	static int N, K, result = 0;
	static boolean[] prime;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		prime = new boolean[N + 1];
		get_prime();
		System.out.println(result);
	}
	public static void get_prime() {
		prime[0] = prime[1] = true;
		int cnt = 0;
		for(int i = 2; i <= N; i++) {
			if(prime[i]) continue;
			else cnt++;
			for(int j = i * i; j <= N; j += i) {
				if(!prime[j]) cnt++;
				prime[j] = true;
				if(cnt == K) {
					result = j;
					break;
				}
			}
			if(cnt == K && result == 0) {
				result = i;
				break;
			} else if(cnt == K) break;
		}
	}
}