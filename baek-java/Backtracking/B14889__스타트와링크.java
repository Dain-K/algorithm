import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B14889_스타트와링크 {
	// BOJ / 14889번 / 스타트와 링크 
	// 브루트포스 알고리즘 / 백트래킹
	static int N, min;
	static int[][] map;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		min = Integer.MAX_VALUE;
		visited = new boolean[N];
		combination(0, 0);
		System.out.println(min);
	}
	public static void combination(int index, int count) {
		if(count == N / 2) {
			min = Math.min(min, diff());
			return;
		}
		for(int i = index; i < N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				combination(i + 1, count + 1);
				visited[i] = false;
			}
		}
	}
	public static int diff() {
		int start = 0;
		int Link = 0;
		for(int i = 0; i < N - 1; i++) {
			for(int j = i + 1; j < N; j++) {
				if(visited[i] && visited[j]) {
					start += map[i][j] + map[j][i];
				} else if(!visited[i] && !visited[j]) {
					Link += map[i][j] + map[j][i];
				}
			}
		}
		return Math.abs(start - Link);
	}

}
