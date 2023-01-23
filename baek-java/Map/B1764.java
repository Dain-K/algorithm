package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class B1764 {
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	Map<String, Integer> map = new HashMap<>();
    	
    	for(int i = 0; i < N; i++) {
    		map.put(br.readLine(), 0);
    	}
    	
    	List<String> keyList = new ArrayList<>();
    	
    	for(int i =0; i < M; i++) {
    		String s = br.readLine();
    		if(map.containsKey(s)) {
    			keyList.add(s);
    		}
    	}
    	
    	Collections.sort(keyList);
    	
    	System.out.println(keyList.size());
    	
    	for(String data: keyList) {
    		System.out.println(data);
    	}
        	
    }
    
}