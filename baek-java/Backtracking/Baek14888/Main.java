package Backtracking.Baek14888;

import java.util.Scanner;

public class Main {
	
	public static int N; // 수의 개수
	public static int[] arr; // 입력 값
	public static int[] operator = new int[4]; // 연산자 - 덧셈 뺄셈 곱셈 나눗셈
	public static int MAX = Integer.MIN_VALUE; // 최댓값
	public static int MIN = Integer.MAX_VALUE; // 최솟값

	
	public static void main(String[] args)  {	
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < operator.length; i++) {
			operator[i] = sc.nextInt();
		}
		
		dfs(arr[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
		
		sc.close();
	}
	
	public static void dfs(int num, int index) {
		
		/* 종료 조건 */
		if(index == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			
			// 연산자가 있을 경우
			// 연산자 배열 값이 1 이상인 경우
			if(operator[i] > 0) { 
				
				operator[i]--;
				
				if(i == 0)
					dfs(num + arr[index], index + 1);
				else if(i == 1)
					dfs(num - arr[index], index + 1);
				else if(i == 2)
					dfs(num * arr[index], index + 1);
				else 
					dfs(num / arr[index], index + 1);
				
				operator[i]++;
				
			}
		}
		
		
	}

}