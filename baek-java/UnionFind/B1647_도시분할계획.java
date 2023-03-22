package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1647_도시분할계획 {
	static int[] parent;
	static PriorityQueue<Edge> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 마을에 있는 집의 개수
		int M = Integer.parseInt(st.nextToken()); // 집들을 연결하는 길의 개수
		parent = new int [N + 1];
		for(int i = 0; i < N + 1; i++) parent[i] = i;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			pq.add(new Edge(s, e, v));
		}
		int result = 0;
		int max = 0;
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result += now.v;
				max = Math.max(max, now.v);
			}
		}
		System.out.println(result - max);
	}
	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) parent[b] = a;
	}
	public static int find(int n) {
		if(n == parent[n]) return n;
		else return parent[n] = find(parent[n]);
	}

}
class Edge implements Comparable<Edge> {
	int s, e, v;
	Edge(int s, int e, int v) {
		this.s = s;
		this.e = e;
		this.v = v;
	}
	@Override
	public int compareTo(Edge e) {
		return this.v - e.v;
	}
}