package GraphTraversal.Baek1697;

import java.util.*;
import java.io.*;
public class Main
{
	static int N, K;
	static int[] visited = new int[100001];
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken()); // 수빈이의 위치
        K = Integer.parseInt(st.nextToken()); // 동생의 위치
        
        if(N == K) {
        	System.out.println(0);
        	return;
        }
        
        bfs();
        System.out.println(visited[K]);
        
    }
    
    public static void bfs() {
    	Queue<Integer> q = new LinkedList<>();
    	q.add(N);
    	
    	while(!q.isEmpty()) {
    		int x = q.poll();
    		
    		if(x - 1 >= 0 && visited[x - 1] == 0) {
    			q.add(x-1);
    			visited[x-1] = visited[x] + 1;
    		}
    		if(x + 1 < visited.length && visited[x + 1] == 0) {
    			q.add(x+1);
    			visited[x+1] = visited[x] + 1;
    		}
    		if(x*2 < visited.length && visited[x*2] == 0) {
    			q.add(x*2);
    			visited[x*2] = visited[x] + 1;
    		}
    	}
    }
    
    
    
}