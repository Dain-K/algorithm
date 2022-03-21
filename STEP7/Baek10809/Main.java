package STEP7.Baek10809;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String alpa = "abcdefghijklmnopqrstuvwxyz";
		

		for(int i = 0; i< alpa.length();i++) {
			int result = -1;
			for(int j = 0; j < s.length(); j++) {
				if(result == -1)
					if(alpa.charAt(i) == s.charAt(j) ) {
						result = j;
				}
			}
			System.out.print(result);
			System.out.print(" ");
		}
		
		

		sc.close();
		
	}

}

