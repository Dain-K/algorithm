package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B14950_정복자 {
	static int[] parent;
	static PriorityQueue<Edge> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int t = Integer.parseInt(st.nextToken());
		parent = new int[N + 1];
		for(int i = 0; i < N + 1; i++) parent[i] = i;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			pq.add(new Edge(A, B, C));
		}
		int result = 0;
		int count = 0;
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				result += t * count + now.v;
				count++;
			}
			
		}
		System.out.println(result);
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
