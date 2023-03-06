package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2563 {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		boolean[][] arr = new boolean[101][101];
		int result = 0;
		
		for(int i = 0; i < num; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int a = x; a < x + 10; a++) {
				for(int b = y; b < y + 10; b++) {
					if(arr[a][b] != true) {
						arr[a][b] = true;
						result++;
					}
				}
			}
		}
		
		
		System.out.println(result);
		
	}
	
}
