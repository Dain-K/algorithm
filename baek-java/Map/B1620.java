package Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class B1620 {
    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int N = Integer.parseInt(st.nextToken()); // 도감에 수록되어있는 포켓몬 수
    	int M = Integer.parseInt(st.nextToken()); // 내가 맞춰야하는 문제의 개수
    	
    	Map<String, Integer> map1 = new HashMap<>();
    	Map<Integer, String> map2 = new HashMap<>();
    	
    	for(int i = 0; i < N; i++) {
    		String input = br.readLine();
    		map1.put(input, i+1);
    		map2.put(i+1, input);
    	}
    	for(int i = 0; i < M ; i++) {
    		String input = br.readLine();
    	
    		if(isNumeric(input)) { // 숫자일 경우
    			System.out.println(map2.get(Integer.parseInt(input)));
    		}else {
    			System.out.println(map1.get(input));
    		}
    	}
        	
    }
    
    public static boolean isNumeric(String input) {
    	try {
    		Integer.parseInt(input);
    		return true;
    	}
    	catch(NumberFormatException e) {
    		return false;
    	}
    }
}
