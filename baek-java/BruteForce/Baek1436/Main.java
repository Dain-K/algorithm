package BruteForce.Baek1436;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 10000보다 작은 수

		int num = 666;
		int count = 1;

		while (count != N) {
			num++;
			if (String.valueOf(num).contains("666")) {
				count++;
			}
		}

		System.out.println(num);

		sc.close();
	}

}