package UnionFind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1922_네트워크연결 {
	static int[] parent;
	static PriorityQueue<Edge> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine()); // 컴퓨터의 수
		int M = Integer.parseInt(br.readLine()); // 연결할 수 잇는 선의 수
		parent = new int[N + 1];
		for(int i = 0; i < N + 1; i++) parent[i] = i;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			pq.add(new Edge(s, e, v));
		}
		int result = 0;
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			if(find(now.e) != find(now.s)) {
				union(now.e, now.s);
				result += now.v;
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