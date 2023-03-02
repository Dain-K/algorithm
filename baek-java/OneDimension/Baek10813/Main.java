import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        
        for(int i = 1; i < N + 1; i++) {
        	arr[i] = i;
        }
        
        for(int i = 0; i < M; i++) {
        	StringTokenizer ij = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(ij.nextToken());
        	int b = Integer.parseInt(ij.nextToken());
        	int now = arr[a];
        	arr[a] = arr[b];
        	arr[b] = now;
        }
        
        for(int i = 1; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
    
}