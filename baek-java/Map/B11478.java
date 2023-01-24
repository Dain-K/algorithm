package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class B11478 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	String input = br.readLine();
    	String find = "";
    	Map<String, Integer> map = new HashMap<>();
    	int num = 0;
    	int i = 1;
    	
    	while(true) {
    		find = input.substring(num, num + i);
    		if(!map.containsKey(find)) map.put(find, 0);
    		num++;
    		if(num + i > input.length()) {
    			num = 0;
    			i++;
    		}
    		//System.out.println(find);
    		if(find.length() == input.length())
    			break;
    	}
    	
    	System.out.println(map.size());
    	
    }
    
}