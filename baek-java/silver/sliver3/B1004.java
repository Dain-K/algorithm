package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1004 {
	
	public static void main(String[] args) throws IOException {
			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		// 경계에 맞닿거나 서로 교차하는 경우 없음
		// 출발점이나 도착점이 행성계 경계에 걸쳐진 경우 입력이 주어지지 않음
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			// 출발점
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			// 도착점
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			int result = 0;
			
			int planetNum = Integer.parseInt(br.readLine()); // 행성계의 개수
			for(int p = 0; p < planetNum; p++) {
				StringTokenizer c = new StringTokenizer(br.readLine());
				// 행성계의 중점
				int cx = Integer.parseInt(c.nextToken());
				int cy = Integer.parseInt(c.nextToken());
				int r =  Integer.parseInt(c.nextToken()); // 반지름
				
				if(Math.pow(cx - x1, 2) + Math.pow(cy - y1, 2) < Math.pow(r, 2)) { // 출발점이 원 안에 있는 경우
					if(Math.pow(cx - x2, 2) + Math.pow(cy - y2, 2) >= Math.pow(r, 2)) { // 도착점이 원 안에 있지 않은 경우
						result++;
					}
				}
				
				if(Math.pow(cx - x2, 2) + Math.pow(cy - y2, 2) < Math.pow(r, 2)) { // 도착점이 원 안에 있는 경우
					if(Math.pow(cx - x1, 2) + Math.pow(cy - y1, 2) >= Math.pow(r, 2)) { // 출발점이 원 안에 있지 않은 경우
						result++;
					}
				}
			}
			System.out.println(result);
		}
		
		
		
		
		// 최소의 행성계 진입/이탈 횟수 출력
	}
	
}
