package STEP14.Baek15649;

import java.util.Scanner;

public class Main {
	
	public static boolean[] visited;
	public static int[] arr;
	
	public static void main(String[] args) {	
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		arr = new int[M];
		visited = new boolean[N];
		
		DFS(N, M, 0);
		
		sc.close();
		
	}

	public static void DFS(int N, int M, int depth) {
		if(depth == M) {
			for(int val: arr) {
				System.out.print(val + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = 0; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[depth] = i + 1;
				DFS(N, M, depth + 1);
				visited[i] = false;
			}
		}
	}

}