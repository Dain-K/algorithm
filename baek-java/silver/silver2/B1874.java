import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B1874
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int start = 0;
        boolean error = false;
        
        while(N --> 0) {
        	int now = Integer.parseInt(br.readLine());
        	
        	if(now > start) {
        		for(int i = start + 1; i <= now; i++) {
        			stack.push(i);
        			sb.append("+").append("\n");
        		}
        		start = now;
        	}
        	if(stack.peek() != now) {
        		System.out.println("NO");
        		error = true;
        		break;
        	}
        	
        	stack.pop();
        	sb.append("-").append("\n");
        }
        if(error == false) System.out.println(sb);    
    }
    
}