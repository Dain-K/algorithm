package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1197_최소스패닝트리 {
	static int[] parent;
	static PriorityQueue<Edge> q = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int V = Integer.parseInt(st.nextToken());
		int E = Integer.parseInt(st.nextToken());
		parent = new int[V + 1];
		for(int i = 0; i < V; i++) parent[i] = i;
		for(int i = 0; i < E; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int C = Integer.parseInt(st.nextToken());
			q.add(new Edge(A, B, C));
		}
		int useEdge = 0;
		int result = 0;
		while(useEdge < V - 1) {
			Edge nowE = q.poll();
			if(find(nowE.A) != find(nowE.B)) {
				Union(nowE.A, nowE.B);
				result += nowE.C;
				useEdge++;
			}
		}
		System.out.println(result);
	}
	public static void Union(int a, int b)  {
		a = find(a);
		b = find(b);
		if(a!=b) parent[b] = a;
	}
	public static int find(int n) {
		if(n == parent[n]) return n;
		else return parent[n] = find(parent[n]);
	}
}

class Edge implements Comparable<Edge> {
	int A, B, C;
	Edge(int A, int B, int C){
		this.A = A;
		this.B = B;
		this.C = C;
	}
	@Override
	public int compareTo(Edge e) { // 가중치를 기준으로 오름차순 정렬
		return this.C - e.C;
	}
	
}
