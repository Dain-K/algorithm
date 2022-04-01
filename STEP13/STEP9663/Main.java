package STEP13.STEP9663;

import java.util.Scanner;

public class Main {
	
	/*
	 * 퀸은 상하좌우, 대각선으로 칸수에 관계없이 움직일 수 있다.
	 * 크기가 N*N 인 체스판 위에 퀸 N개가 서로를 공격 할 수 없게 놓는 경우의 수를 구해야한다.
	 * 1  2  3  4  5
	 * 6  7  8  9  10
	 * 11 12 13 14 15
	 * 16 17 18 19 20
	 * 21 22 23 24 25 
	 * */
	
	public static int N; // N*N 체스판
	public static int[] arr; // 체스판 번호
	public static int count; // 경우의 수
	
	public static void main(String[] args)  {	
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		
		
		sc.close();
	}
	
	public static void nqueen(int locate) {
		

		
		
	}

}