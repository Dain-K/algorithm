package GraphTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1269_DFS와BFS {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int start = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n + 1];
		for(int i = 0; i < n + 1; i++) arr[i] = new ArrayList<Integer>();
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		for(int i = 1; i <= n; i++) Collections.sort(arr[i]);
		visited = new boolean[n + 1];
		DFS(start, sb);
		sb.append("\n");
		visited = new boolean[n + 1];
		BFS(start, sb);
		System.out.println(sb.toString());
	}
	public static void DFS(int n, StringBuilder sb) {
		sb.append(n + " ");
		visited[n] = true;
		for(int i: arr[n]) {
			if(!visited[i]) DFS(i, sb);
		}
	}
	public static void BFS(int n, StringBuilder sb) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(n);
		visited[n] = true;
		
		while(!queue.isEmpty()) {
			int nowN = queue.poll();
			sb.append(nowN + " ");
			for(int i: arr[nowN]) {
				if(!visited[i]) {
					visited[i] = true;
					queue.add(i);
				}
			}
		}
	}

}
