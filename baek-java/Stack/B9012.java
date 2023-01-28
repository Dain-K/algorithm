package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class B9012 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int N = Integer.parseInt(br.readLine());
    	String result = "YES";
    	
    	for(int i = 0; i < N; i++) {
    		String str = br.readLine();
    		Stack<String> stack = new Stack<>();
    		result = "YES";
    		for(int j = 0; j < str.length(); j++) {
    			char element = str.charAt(j);
    			
    			if(element == '(')
    				stack.add(String.valueOf(element));
    			else {
    				if(stack.empty()) {
    					result = "NO";
    					break;
    				}    					
    				else
    					stack.pop();
    			}
    			
    		}
    		if(!stack.empty())
    			result = "NO";
    		
    		System.out.println(result);
    	}
    	
    	
    }
    
}
