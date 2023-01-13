package Recursion.Baek11729;

import java.util.Scanner;

public class Main {

	public static StringBuilder sb = new StringBuilder(); // 문자열 더하기 위해서

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sb.append((int) (Math.pow(2, N) - 1)).append('\n');

		Hanoi(N, 1, 2, 3);
		System.out.println(sb);
		sc.close();
	}

	/*
	 * N: 원판의 개수
	 * start: 출발지
	 * mid: 옮기기 위해 이동할 장소
	 * end: 목적지
	 * 
	 */

	public static void Hanoi(int N, int start, int mid, int end) {
		// 이동할 원반이 한개일 경우
		if (N == 1) {
			sb.append(start + " " + end + "\n");
			return;
		}
		Hanoi(N - 1, start, end, mid);
		sb.append(start + " " + end + "\n");
		Hanoi(N - 1, mid, start, end);
	}

}
