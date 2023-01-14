package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B10816 {
	
	static int N;
	static int M;
	
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuffer sb = new StringBuffer();
    	N = Integer.parseInt(br.readLine());
    	
    	Map<Integer, Integer> map = new HashMap<>();
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < N; i++) {
    		int input = Integer.parseInt(st.nextToken());
    		map.put(input, map.getOrDefault(input, 0) + 1);
    	}
    	
    	M = Integer.parseInt(br.readLine());
    	st = new StringTokenizer(br.readLine());
    	
    	for(int i = 0; i < M; i++) {
    		int find = Integer.parseInt(st.nextToken());
    		if (map.containsKey(find))
    			sb.append(map.get(find) + " ");
    		else
    			sb.append(0 + " ");
    	}
    	System.out.println(sb.toString());
        	
    }
    
}

