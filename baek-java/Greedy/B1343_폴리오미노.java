package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343_폴리오미노 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		s = s.replaceAll("XXXX", "AAAA");
		s = s.replaceAll("XX", "BB");
		if(s.contains("X")) System.out.println(-1);
		else System.out.println(s);
	}
	
}
