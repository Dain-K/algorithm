package STEP10.Baek27998;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int sum = sc.nextInt();
		int[] num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}

		int MySum = 0, result = 0;

		for (int i = 0; i < N - 2; i++) {
			for (int j = 1; j < N - 1; j++) {
				for (int z = 2; z < N; z++) {
					if (i == j || i == z || (i == j && j == z) || j == z) {
						continue;
					}
					MySum = num[i] + num[j] + num[z];
					// System.out.print(num[i]+ " ");
					// System.out.print(num[j]+ " ");
					// System.out.println(num[z]);
					if (sum >= MySum) {
						if (MySum > result) {
							result = MySum;

						}
					}
				}
			}
		}

		System.out.println(result);

		sc.close();
	}

}
