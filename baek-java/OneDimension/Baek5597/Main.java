import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] arr = new int[31];
        for(int i = 0; i < 28; i++) {
        	int n = Integer.parseInt(br.readLine()); // 출석번호
        	arr[n] = 1;
        }
        for(int i = 1; i < arr.length; i++) if(arr[i] == 0) pq.add(i);
        
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
    
}