package STEP6.Baek2675;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // ���̽��� ����
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				for (int z = 0; z < n; z++)
					System.out.print(s.charAt(j));
			}
			System.out.println();
		}
		sc.close();

	}

}
