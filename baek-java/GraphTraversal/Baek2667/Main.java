package GraphTraversal.Baek2667;

import java.util.*;
import java.io.*;

public class Main
{
	static int size;
	static int[][] map;
	static boolean[][] visited;
	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int count;
	static int[] countNum = new int[25*25];
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        size = Integer.parseInt(br.readLine());
        map = new int[size][size];
        visited = new boolean[size][size];
        for(int i = 0; i < size; i++) {
        	String s = br.readLine();
        	for(int j = 0; j < size; j++) {
        		map[i][j] = s.charAt(j)- '0'; 
        	}
        }
        
        for(int i = 0; i < size; i++) {
        	for(int j = 0; j < size; j++) {
        		if(!visited[i][j] && map[i][j] == 1) {
        			bfs(i,j);
        			count++;
        		}
        	}
        }
        System.out.println(count);
        Arrays.sort(countNum);
        for(int i: countNum) {
        	if(i == 0) continue;
        	else System.out.println(i);
        }
    }
    
    public static void bfs(int x, int y) {
    	visited[x][y] = true;
    	countNum[count]++;
    	

		for(int i = 0; i < 4; i++) {
			int nextX = x + dx[i];
			int nextY = y + dy[i];
			
			if(nextX < 0 || nextY < 0 || nextX >= size || nextY >= size) continue;
			
			if(!visited[nextX][nextY] && map[nextX][nextY] == 1) {
				bfs(nextX, nextY);
			}
		}
    }
    
    
}