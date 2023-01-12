package NumberTheory.Baek11050;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		int result = 1;
		
		for(int i = 0; i < K; i++) {
			result = result * N;
			N--;
		}
		
		for(int i = 1; i <= K; i++) {
			result = result / i;
		}
		
		System.out.println(result);
			
		
		sc.close();
	}

}