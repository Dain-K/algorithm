package String.Baek2908;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		String s1_reverse = "";
		String s2_reverse = "";
		for (int i = s1.length() - 1; i >= 0; i--)
			s1_reverse = s1_reverse + s1.charAt(i);
		for (int i = s2.length() - 1; i >= 0; i--)
			s2_reverse = s2_reverse + s2.charAt(i);

		if (Integer.parseInt(s1_reverse) > Integer.parseInt(s2_reverse))
			System.out.print(s1_reverse);
		else
			System.out.print(s2_reverse);
		sc.close();

	}

}
