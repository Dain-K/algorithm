package Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class B11653_소인수분해
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int N = Integer.parseInt(br.readLine());
        int num = N;
        while(true) {
        	for(int i = 2; i <= N; i++) {
        		if(num % i == 0) {
        			pq.add(i);
        			num = num / i;
        			break;
        		}
        	}
        	if(num == 1) break;
        }
        while(!pq.isEmpty()) System.out.println(pq.poll());
    }
    
}