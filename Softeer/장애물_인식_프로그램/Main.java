package Softeer.장애물_인식_프로그램;

import java.util.*;
import java.io.*;


public class Main
{
    static int N;
    static int[][] map;
    static int[] dx = {0, 0, 1, -1};
    static int[] dy = {1, -1, 0, 0};
    static boolean[][] visited;
    static int size;
    static List<Integer> list;
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        visited = new boolean[N][N];
        list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String s = br.readLine();
            for(int j = 0; j < N; j++){
                map[i][j] = s.charAt(j) - '0';
            }
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++) {
                if(!visited[i][j] && map[i][j] == 1)
                    bfs(i, j);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(int i: list){
            System.out.println(i);
        }

    }

    public static void bfs(int x, int y) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] {x,y});
        visited[x][y] = true;

        size = 1;
        while(!q.isEmpty()) {
            int[] temp = q.poll();
            
            for(int i = 0; i < 4; i++){
                int nextX = temp[0] + dx[i];
                int nextY = temp[1] + dy[i];

                if(nextX < 0 || nextY < 0 || nextX >= N || nextY >= N || visited[nextX][nextY] || map[nextX][nextY] == 0) continue;

                if(!visited[nextX][nextY]) {
                    visited[nextX][nextY] = true;
                    q.add(new int[] {nextX, nextY});
                    size++;
                }
            }
            
        }
        list.add(size);
    }
}