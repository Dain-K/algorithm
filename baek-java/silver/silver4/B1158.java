import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1158 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // 1부터 N까지
		int K = Integer.parseInt(st.nextToken());
		Queue<Integer> q = new LinkedList<>();
		Queue<Integer> result = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			q.offer(i);
		}
		
		int count = 0; 
		
		while(!q.isEmpty()) {
			int num = q.poll();
			count++;
			if(count == K) {
				result.offer(num);
				count = 0;
			}
			else q.offer(num);		
		}
		System.out.print("<");
		while(result.size() != 1) {
			System.out.print(result.poll() + ", ");
		}
		System.out.print(result.poll() + ">");
		
	}
}
