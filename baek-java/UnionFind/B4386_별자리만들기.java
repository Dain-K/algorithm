package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B4386_별자리만들기 {
	static int[] parent;
	static PriorityQueue<Edge> pq = new PriorityQueue<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		Star star[] = new Star[N];
		parent = new int[N];
		for(int i = 0; i < N; i++) parent[i] = i;
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			double x = Double.parseDouble(st.nextToken());
			double y = Double.parseDouble(st.nextToken());
			star[i] = new Star(i, x, y);
		}
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				pq.add(new Edge(i, j, Math.sqrt(Math.pow(star[i].x - star[j].x, 2) + Math.pow(star[i].y - star[j].y, 2))));
			}
		}
		double result = 0;
		while(!pq.isEmpty()) {
			Edge now = pq.poll();
			if(find(now.s) != find(now.e)) {
				Union(now.s, now.e);
				result += now.w;
			}
		}
		System.out.println(Math.round(result * 100) / 100.0);

	}
	public static void Union(int a, int b) { // 작은 값이 그 그룹의 대표
		a = find(a);
		b = find(b);
		if(a > b) parent[a] = b;
		else parent[b] = a;
	}
	public static int find(int n) {
		if(n == parent[n]) return n;
		else return parent[n] = find(parent[n]);
	}
}
class Star {
	int num;
	double x, y;
	Star(int num, double x, double y) {
		this.num = num;
		this.x = x;
		this.y = y;
	}
}
class Edge implements Comparable<Edge> {
	int s, e;
	double w;
	Edge(int s, int e, double w){
		this.s = s;
		this.e = e;
		this.w = w;
	}
	@Override
	public int compareTo(Edge e) {
		return Double.compare(this.w, e.w);
	}
}
