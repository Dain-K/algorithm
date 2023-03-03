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
        Queue<Integer> q = new LinkedList<>();
        while(true) {
        	int n = Integer.parseInt(br.readLine());
        	if(n == -1) break;
        	int sum = 0;
        	
        	for(int i = 1; i < n; i++) {
        		if(n % i == 0) {
        			sum += i; 
        			q.add(i);
        		}
        	}
        	if(n == sum) {
        		System.out.print(n + " = ");
        		while(!q.isEmpty()) {
        			System.out.print(q.poll());
        			if(!q.isEmpty()) System.out.print(" + ");
        		}
        		System.out.println();
        	}else {
        		System.out.println(n + " is NOT perfect.");
        	}
        	q.clear();
        	
        }
        
    }
    
}