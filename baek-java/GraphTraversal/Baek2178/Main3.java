package GraphTraversal.Baek2178;

import java.util.*;
import java.io.*;

public class Main3
{
	static int N, M;
	static int[] dx = {0, 0, 1, -1};
	static int[] dy = {1, -1, 0, 0};
	static int[][] map;
	static boolean[][] visited;
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];
        visited = new boolean[N][M];        
        for(int i = 0; i < N; i++) {
        	String s = br.readLine();
        	for(int j = 0; j < M; j++) {
        		map[i][j] = s.charAt(j) - '0';
        	}
        }
        System.out.println(bfs(0,0));
        
    }
    
    public static int bfs(int x, int y) {
    	Queue<int[]> q = new LinkedList<>();
    	q.add(new int[] {x,y});
    	visited[x][y] = true;
    	
    	while(!q.isEmpty()) {
    		int[] temp = q.poll();
    		for(int i = 0; i < 4; i++) {
    			int nextX = temp[0] + dx[i];
    			int nextY = temp[1] + dy[i];
    			
    			if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
    			
    			if(!visited[nextX][nextY] && map[nextX][nextY] == 1) {
    				visited[nextX][nextY] = true;
    				map[nextX][nextY] = map[temp[0]][temp[1]] + 1;
    				q.add(new int[] {nextX, nextY});
    			}
    		}
    	}
    	return map[N-1][M-1];
    }
    
}