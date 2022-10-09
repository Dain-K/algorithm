package STEP10.Baek2231;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int flag = 0;
		for (int i = 0; i < 1000000; i++) {
			int sum = 0;
			sum = i + i % 10 + i / 10 % 10 + i / 100 % 10 + i / 1000 % 10 + i / 10000 % 10 + i / 100000;
			if (sum == N) {
				System.out.println(i);
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(0);
		}

		sc.close();
	}

}
