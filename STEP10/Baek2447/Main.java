package STEP10.Baek2447;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static char arr[][]; // 2차원 배열 생성 
	
	public static void star(int x, int y, int N) {
		int div = 0;
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		div = N / 3; // 입력받은 값을 3씩 나누어준다.
		
		for (int i = 0; i < 3; i++) { // 3*3 크기의 별 생성
			for (int j = 0; j < 3; j++) {
				if(i == 1 && j == 1) // N이 3일경우 (1,1)비우기
					continue;
				star(x+(div*i), y+(div*j), div); // 시작점을 옮겨줌
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		arr = new char[N][N]; // N 크기 배열
		
		for (int i = 0; i < N; i++) {
			Arrays.fill(arr[i], ' '); // 배열 채우기
		}
		
		star(0, 0, N);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		sc.close();
	}
}