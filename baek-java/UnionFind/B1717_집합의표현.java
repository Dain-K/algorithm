package UnionFind;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1717_집합의표현 {
	public static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1];
		for(int i = 1; i <= N; i++) { // 배열 초기화
			arr[i] = i;
		}
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int mode = Integer.parseInt(st.nextToken());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(mode == 0) Union(a, b);
			else Check(a, b);
		}
	}
	
	public static void Union(int a, int b) { // 합집합 연산
		a = find(a);
		b = find(b);
		if(a != b) arr[b] = a;
	}
	public static int find(int n) {
		if(n == arr[n]) return n;
		else return arr[n] = find(arr[n]);
	}
	public static void Check(int a, int b) {
		a = find(a);
		b = find(b);
		if(a == b) System.out.println("YES");
		else System.out.println("NO");
	}
}
