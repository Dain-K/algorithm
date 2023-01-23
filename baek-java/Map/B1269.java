package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;
import java.util.StringTokenizer;

public class B1269 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int ASize = Integer.parseInt(st.nextToken());
    	int BSize = Integer.parseInt(st.nextToken());
    	int result = ASize + BSize;
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < ASize; i++) {
    		map.put(Integer.parseInt(st.nextToken()), 0);
    	}
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i = 0; i < BSize; i++) {
    		if(map.containsKey(Integer.parseInt(st.nextToken()))) {
    			result = result - 2;
    		}
    	}
    	
    	System.out.println(result);
    }
    
}