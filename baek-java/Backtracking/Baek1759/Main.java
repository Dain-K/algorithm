package Backtracking.Baek1759;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static int L, C;
	static char[] input;
	static char[] arr;
	static char[] sorted;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		L = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String s = "";
		for(int i = 0; i < C; i++) {
			s += st.nextToken();
		}
		input = s.toCharArray();
		Arrays.sort(input);
		arr = new char[L]; // 출력 배열
		combination(0, 0);
	}
	
	// 조합
	public static void combination(int cnt, int start) {
		if(cnt == L) {
			int vowel = 0;
			int consonant = 0;
			for(char c: arr) {
				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowel++; // 자음 ++
				} else {
					consonant++; // 모음++;
				}
			}
			if(vowel >= 1 && consonant >= 2) {
				System.out.println(new String(arr));
			}
			return;
		}
		for(int i = start; i < C; i++) {
			arr[cnt] = input[i];
			combination(cnt + 1, i + 1);	
		}
	}

}

