package silver.silver2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class B11724_연결요소의개수 {
	static ArrayList<Integer>[] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		// 중복 입력 -> ArrayList
		// 중복 입력 안됨 -> HashSet
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		arr = new ArrayList[n + 1];
		visited = new boolean [n + 1];
		for(int i = 0; i < n + 1; i++) {
			arr[i] = new ArrayList<Integer>(); // null 값이 들어가 있으므로 초기화
		}
		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			arr[s].add(e);
			arr[e].add(s);
		}
		int count = 0;
		for(int i = 1; i < n + 1; i++) {
			if(!visited[i]) {
				count++;
				DFS(i);
			}
		}
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
	
	public static void DFS(int v) {
		if(visited[v]) return;
		visited[v] = true;
		for(int i: arr[v]) {
			if(!visited[i]) DFS(i);
		}
	}

}

