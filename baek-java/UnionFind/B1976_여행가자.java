package UnionFind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1976_여행가자 {
	static int N, M;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine()); // 도시의 수
		arr = new int[N + 1];
		for(int i = 1; i <= N; i++) arr[i] = i;
		M = Integer.parseInt(br.readLine()); // 여행계획에 속한 도시의 수
		for(int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				if(Integer.parseInt(st.nextToken()) == 1) Union(i, j);
			}
		}
		StringTokenizer st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		String result = "YES";
		for(int i = 1; i < M; i++) {
			int next = Integer.parseInt(st.nextToken());
			if(!check(start, next)) {
				result = "NO";
				break;
			}
			start = next;
		}
		System.out.println(result);
		
	}
	
	public static void Union(int a, int b) {
		a = find(a);
		b = find(b);
		if(a != b) arr[b] = a;
	}
	public static int find(int n) {
		if(n == arr[n]) return n;
		else return arr[n] = find(arr[n]);
	}
	public static boolean check(int a, int b) {
		a = find(a);
		b = find(b);
		if(a == b) return true;
		else return false;
	}
}
