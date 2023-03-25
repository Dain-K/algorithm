package UnionFind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B13905_세부 {
	static int[] parent;
	static PriorityQueue<Edge> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 집의 수
		int M = Integer.parseInt(st.nextToken()); // 다리의 수
		st = new StringTokenizer(br.readLine());
		int s = Integer.parseInt(st.nextToken()); // 숭이의 출발위치
		int e = Integer.parseInt(st.nextToken()); // 혜빈이의 위치
		int result = 0;;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			pq.add(new Edge(a,b,c));
		}
		parent = new int[N + 1];
		for(int i = 0; i < N + 1; i++) parent[i] = i;
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			if(find(now.s) != find(now.e)) {
				union(now.s, now.e);
				if(find(s) == find(e)) {
					result = now.v;
					break;
				}
			}
		}
		System.out.println(result);
	}
	static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) parent[b] = a;
	}
	static int find(int n) {
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
		return e.v - this.v; // 최대한 만들고자 함
	}
}
