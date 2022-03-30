package STEP7.Baek1157;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String small_alpa = "abcdefghijklmnopqrstuvwxyz";
		String big_alpa = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int[] n = new int[small_alpa.length()];
		
		for(int i = 0; i< small_alpa.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(small_alpa.charAt(i)==s.charAt(j))
					n[i] += 1; 
			}
		}
		for(int i = 0; i< big_alpa.length(); i++) {
			for(int j = 0; j < s.length(); j++) {
				if(big_alpa.charAt(i)==s.charAt(j))
					n[i] += 1; 
			}
		}
		
		int compare = 0;
		char result = ' ';
		for(int i = 0; i< big_alpa.length(); i++) {
			if (compare < n[i]) {
				compare = n[i];
				result = big_alpa.charAt(i);
			}
			else if (compare == n[i])
				result = '?';
		}
		System.out.println(result);

		
		sc.close();
		
	}

}

