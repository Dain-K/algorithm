package main;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int total = sc.nextInt();
		int[] num = new int[N];
		
		for(int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		int result = 0;
		for(int i = 0; i < N - 2; i++) {
			for(int j = i + 1; j < N - 1; j++) {
				for(int z = j + 1; z < N; z++) {
					int temp = num[i] + num[j] + num[z];					
					if(result < temp) {
						if(total >= temp) {
							result = temp;
						}
					}
				}
			}
			
		}
		System.out.print(result);
		sc.close();
	}

}
