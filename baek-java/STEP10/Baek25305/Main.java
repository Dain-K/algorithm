import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		
		int total = sc.nextInt();
		int rank = sc.nextInt();
		Integer[] score = new Integer[total];
		
		for(int i = 0; i < total; i++) {
			score[i] = sc.nextInt();
		}
		
		Arrays.sort(score, Collections.reverseOrder());
		
		System.out.println(score[rank - 1]);
		
	}
		
}