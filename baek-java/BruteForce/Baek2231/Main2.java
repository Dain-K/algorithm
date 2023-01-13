package BruteForce.Baek2231;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		for(int i = N; i > 0; i--) {		
			int sum = i + i % 10 + i / 10 % 10 + i / 100 % 10 + i / 1000 % 10 + i / 10000 % 10 + i / 100000;
			if(sum == N) {
				result = i;
			}
		}
		System.out.println(result);
		
		sc.close();
	}

}
