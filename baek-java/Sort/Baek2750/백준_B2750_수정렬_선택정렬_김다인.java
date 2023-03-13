package Sort.Baek2750;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 백준_B2750_수정렬_선택정렬_김다인 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] A =  new int[N];
		for(int i = 0; i < N; i++) {
			A[i] = Integer.parseInt(br.readLine());
		}
		
		/* 선택정렬 */
		for(int i = 0; i < N - 1; i++) {
			int min = i;
			for(int j = i + 1; j < N; j++) {
				if(A[j] < A[min]) {
					min = j;
				}
			}
			swap(A, i, min);
		}
		for(int i: A) System.out.println(i);
		
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	
}