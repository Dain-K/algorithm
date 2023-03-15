package Backtracking.Baek9742;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int N, totalCnt;
	static char[] arr;
	static boolean[] visited;
	static String answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		while((input = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(input);
			String s = st.nextToken();
			N = Integer.parseInt(st.nextToken());
			totalCnt = 0;
			arr = new char[s.length()];
			visited = new boolean[s.length()];
			permutation(s, 0);
			if(totalCnt < N) answer = "No permutation";
			System.out.println(s+ " " + N + " = " + answer);
		}

	}
	
	public static void permutation(String str, int cnt) {
		if(cnt == str.length()) {
			totalCnt++;
			if(totalCnt == N) answer = new String(arr);
			return;
		}
		for(int i = 0; i < str.length(); i++) {
			if(!visited[i]) {
				visited[i] = true;
				arr[cnt] = str.charAt(i);
				permutation(str, cnt + 1);
				visited[i] = false;
			}
		}
	}

}

