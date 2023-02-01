package 게임_맵_최단거리;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static boolean[][] visited;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static int n, m;
    
    public int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m];

        return bfs(0, 0, maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});
        
        while(!q.isEmpty()){
            int[] temp = q.poll();
            
            for(int i = 0; i < 4; i++) {
                int nextX = temp[0] + dx[i];
                int nextY = temp[1] + dy[i];
                
                if(nextX < 0 || nextY < 0 || nextX >= n || nextY >= m) continue;
                
                if(!visited[nextX][nextY] && maps[nextX][nextY] == 1){
                    visited[nextX][nextY] = true;
                    maps[nextX][nextY] = maps[temp[0]][temp[1]] + 1;
                    q.add(new int[] {nextX, nextY});
                }
            }
            
        }
        
        if(visited[n-1][m-1]) return maps[n-1][m-1];
        else return -1;
        
    }
}