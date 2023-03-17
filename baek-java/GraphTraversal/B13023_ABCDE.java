package GraphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B13023_ABCDE {

	static int N, M;
	static int result = 0;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken()); // 사람의 수
		M = Integer.parseInt(st.nextToken()); // 친구 관계의 수
		arr = new ArrayList[M + 1];
		for(int i = 0; i < M + 1; i++) { // 초기화
			arr[i] = new ArrayList<>();
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int S = Integer.parseInt(st.nextToken());
			int E = Integer.parseInt(st.nextToken());
			arr[S].add(E);
			arr[E].add(S);
		}
		
		visited = new boolean[N];
		for(int i = 0; i < N; i++) {
			DFS(i, 1);
			if(result == 1) break;
		}
		System.out.println(result);
	}
	
	public static void DFS(int n, int depth) {
		if(depth == 5) {
			result = 1;
			return;
		}
		visited[n] = true;
		for(int i :arr[n]) {
			if(!visited[i]) DFS(i, depth + 1);
		}
		visited[n] = false;
	}

}
