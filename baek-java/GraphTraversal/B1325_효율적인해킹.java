package GraphTraversal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1325_효율적인해킹 {
	static int N, M, cnt, max = 0;
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	static int[] count;
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new ArrayList[N + 1];
		for(int i = 0; i < N + 1; i++) arr[i] = new ArrayList<>();
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
		}
		
		count = new int[N + 1];
		for(int i = 1; i < N + 1; i++) {
			visited = new boolean[N + 1];
			BFS(i);
		}
		for(int i = 1; i < N + 1; i++) max = Math.max(count[i], max);
		for(int i = 1; i < N + 1; i++) {
			if(count[i] == max) bw.write(i + " ");
		}
		bw.flush();
		bw.close();

	}
	static void BFS(int n) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(n);
		visited[n] = true;
		
		while(!q.isEmpty()) {
			int temp = q.poll();
			for(int i: arr[temp]) {
				if(!visited[i]) {
					count[i]++;
					visited[i] = true;
					q.offer(i);
				}
			}
		}
	}
}
