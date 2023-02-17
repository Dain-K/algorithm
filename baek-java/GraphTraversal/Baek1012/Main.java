package GraphTraversal.Baek1012;

import java.util.*;
import java.io.*;

public class Main
{
	static int T, M, N, K;
	static int[][] field;
	static int bugs;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static boolean[][] visited;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        
        
        for(int testcase = 0; testcase < T; testcase++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
            
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());
            
        	field = new int[M][N];
        	visited = new boolean[M][N];
        	bugs = 0;
        	
        	for(int i = 0; i < K; i++) {
        		StringTokenizer st1 = new StringTokenizer(br.readLine());
        		field[Integer.parseInt(st1.nextToken())][Integer.parseInt(st1.nextToken())] = 1;
        	}
        	for(int a = 0; a < M; a++) {
        		for(int b = 0; b < N; b++) {
        			if(!visited[a][b] && field[a][b] == 1) {
        				bfs(a, b);
        				bugs++;
        			}
        		}
        	}
        	System.out.println(bugs);
        }
    }
    public static void bfs(int x, int y) {
    	Queue<int[]> q = new LinkedList<>();
    	q.add(new int[]{x,y});
    	visited[x][y] = true;
    	
    	while(!q.isEmpty()) {
    		int[] temp = q.poll();
    		for(int i = 0; i < 4; i++) {
    			int nextX = temp[0] + dx[i];
    			int nextY = temp[1] + dy[i];
    			
    			if(nextX < 0 || nextY < 0 || nextX >= M || nextY >= N) continue;
    			
    			if(!visited[nextX][nextY] && field[nextX][nextY] == 1) {
    				bfs(nextX, nextY);
    			}
    		}
    	}
    }
}