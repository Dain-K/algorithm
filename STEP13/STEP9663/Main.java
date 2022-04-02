package STEP13.STEP9663;

import java.util.Scanner;

public class Main {

	/*
	 * 퀸은 상하좌우, 대각선으로 칸수에 관계없이 움직일 수 있다.
	 * 크기가 N*N 인 체스판 위에 퀸 N개가 서로를 공격 할 수 없게 놓는 경우의 수를 구해야한다.
	 */

	public static int N; // N*N 체스판
	public static int[] arr; // 체스판 번호
	public static int count; // 경우의 수

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		arr = new int[N];

		nqueen(0);

		System.out.print(count);

		sc.close();
	}

	public static void nqueen(int depth) {
		// depth: 열

		// 행을 다 채운 경우
		if (depth == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			arr[depth] = i;

			// 해당 열에 퀸을 놓을 수 있는지 확인
			if (possible(depth)) {
				nqueen(depth + 1);
			}
		}
	}

	/* 퀸을 놓을 수 있는지 확인하는 함수 */
	public static boolean possible(int col) {

		for (int i = 0; i < col; i++) {

			// 같은 행에 존재하는 경우
			if (arr[col] == arr[i])
				return false;

			// 추가...

		}
		return true;
	}

}