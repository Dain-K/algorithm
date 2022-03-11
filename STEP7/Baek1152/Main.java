package STEP7.Baek﻿1152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count = 1;
		for(int i = 0; i < s.length(); i++) {
			if (i == 0) {
				if (s.charAt(i) == ' ')
					count = 1;
			}
			else {
				if (s.charAt(i) == ' ') {
					count += 1; 
				}
			}
			
			if(i == s.length()-1) {
				if (s.charAt(i) == ' ')
					count -= 1;
			}
		}
		System.out.print(count);
		sc.close();
	}

}

