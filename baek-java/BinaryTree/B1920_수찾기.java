package BinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B1920_수찾기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr); // 오름차순 정렬
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		while(M --> 0) {
			int findNum = Integer.parseInt(st.nextToken());
			int start = 0;
			int end = N - 1;
			boolean find = false;
			while(start <= end) {
				int mid = (start + end) / 2;
				if(arr[mid] < findNum) start = mid + 1;
				else if(arr[mid] > findNum) end = mid - 1;
				else {
					find = true;
					break;
				}
			}
			if(find) System.out.println(1);
			else System.out.println(0);
		}
	}

}
