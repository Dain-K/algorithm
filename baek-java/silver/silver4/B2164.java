import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class B2164 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		while(q.size() != 1) {
			q.poll(); // 제일 위에값버림
			q.offer(q.poll());
		}
		System.out.println(q.peek());
	}
}
