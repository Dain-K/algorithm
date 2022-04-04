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

	public static void nqueen(int row) {
		// depth: 열

		// 행을 다 채운 경우
		if (row == N) {
			count++;
			return;
		}

		for (int i = 0; i < N; i++) {
			
			arr[row] = i; // 현재 위치한 노드의 좌표를 배열에 저장

			// 해당 열에 퀸(Queen)을 놓을 수 있는지 확인(유망한 노드인지 확인)
			if (isPossible(row)) {
				// 서브 트리로 이동 (하위 노드로 이동)
				nqueen(row + 1);
			}
			else {
				// 백트래킹 수행, 해당 노드는 가지 치기가 수행된다.
				arr[row] = 0;
			}
		}
	}

	/* 퀸(Queen)을 놓을 수 있는지 확인하는 함수(유망한 노드인지 확인하는 함수) */
	public static boolean isPossible(int col) {

		for (int i = 0; i < col; i++) {

			// 상위노드에서 같은 행에 퀸(Queen)이 존재하는 경우
			if (arr[col] == arr[i]) {
				return false;
			}
			
			// 대각선에 퀸(Queen)이 존재하는지 확인, 상위 노드의 퀸가 현재 노드의 쿤의 가로세로 거리가 같은지 검사
			else if(Math.abs(arr[col] - arr[i]) == Math.abs(i - col)) {
				return false;
			}


		}
		return true;
	}

}