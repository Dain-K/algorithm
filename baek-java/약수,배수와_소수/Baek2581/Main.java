import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        Queue <Integer> q = new LinkedList<>();
        if(M == 1) M = 2;
        for(int i = M; i <= N; i++) {
        	boolean isTrue = false;
        	
        	for(int j = 2; j < i; j++) {
        		if(i % j == 0) {
        			isTrue = true;
        			break;
        		}
        	}
        	if(isTrue == false) {
        		sum += i;
        		q.add(i);
        	}
        }
        if(sum == 0) System.out.println(-1);
        else {
        	System.out.println(sum);
        	System.out.println(q.poll());
        }
    }
    
}