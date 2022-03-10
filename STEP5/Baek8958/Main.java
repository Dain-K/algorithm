package STEP5.Baek8958;

import java.util.*;

public class Main {

	public static void main(String[] args)   {
		Scanner sc = new Scanner(System.in);
		String arr[] = new String[sc.nextInt()];
		
		for(int i = 0; i< arr.length; i++) {
			arr[i] = sc.next(); // 배열에 문자 입력 받기
		}
		
		for(int i = 0; i< arr.length; i++) { // 모든 문자열 탐색
			int count = 0;
			int sum = 0;
			for (int j = 0; j < arr[i].length() ;j++) {
				if(arr[i].charAt(j)=='O') {
					count++;
				}else {
					count = 0;
				}
				sum = sum + count;
			}
			System.out.println(sum);
		}



		sc.close();
	}

}

