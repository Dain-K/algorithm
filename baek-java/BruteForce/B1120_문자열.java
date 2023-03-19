package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class B1120_문자열 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String A = st.nextToken();
		String B = st.nextToken();
		int min = 50;
		for(int i = 0; i < B.length() - A.length() + 1; i++) {
			int cnt = 0;
			String b = B.substring(i, A.length() + i);
			for(int j = 0; j < A.length(); j++) {
				if(A.charAt(j) != b.charAt(j)) cnt++;
			}
			if(min > cnt) min = cnt;
		}
		System.out.println(min);
	}
}