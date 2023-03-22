package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class B1414_불우이웃돕기 {
	static int sum = 0; // 총 랜선의 길이 저장
	static int[] parent; // 노드별 대표 노드 번호
	static PriorityQueue<Edge> pq = new PriorityQueue<>(); // 노드 간 연결 가중치 저장
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N = Integer.parseInt(br.readLine());
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()); // 'abc' -> ['a','b','c']
			char[] c = st.nextToken().toCharArray();
			for(int j = 0; j < N; j++) {
				int temp = 0; // 입력받은 알파벳을 숫자로 변환한 값
				if(c[j] >= 'a' && c[j] <= 'z') temp = c[j] - 'a' + 1; // 소문자 알파벳일 경우
				else if(c[j] >= 'A' && c[j] <= 'Z') temp = c[j] - 'A' + 27; // 대문자 알파벳일 경우
				sum += temp; // 총 랜선의 길이 저장
				if(i != j && temp != 0) pq.add(new Edge(i, j, temp));
			}
		}
		parent = new int[N];
		for(int i = 0; i < N; i++) parent[i] = i;
		int result = 0;
		int cnt = 0;
		while(!pq.isEmpty()) { // 최소신장트리 알고리즘 수행
			Edge now = pq.poll();
			if(find(now.e) != find(now.s)) { // 같은 부모가 아니라면 -> 연결 가능
				Union(now.e, now.s);
				result += now.v;
				cnt++;
			}
		}
		if(cnt == N - 1) System.out.println(sum - result);
		else System.out.println(-1);
	}
	public static void Union(int a, int b) { // union 연산 : 대표 노드끼리 연결하여 줌
		a = find(a);
		b = find(b);
		if(a != b) parent[b] = a;
	}
	public static int find(int n) {
		if(n == parent[n]) return n;
		else return parent[n] = find(parent[n]); // 재귀함수의 형태로 구현 -> 경로 압축 부분
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