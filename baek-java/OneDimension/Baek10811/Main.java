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
        
        for(int i = 1; i < arr.length; i++) arr[i] = i;
        
        for(int i = 0; i < M; i++) {
        	StringTokenizer ij = new StringTokenizer(br.readLine());
        	int start = Integer.parseInt(ij.nextToken());
        	int end = Integer.parseInt(ij.nextToken());
        	int index = end;
        	for(int j = start; j <= (start + end) / 2; j++) {
        		int temp = arr[j];
        		arr[j] = arr[index];
        		arr[index] = temp;
        		index--;
        	}
        }
        
        for(int i = 1; i < arr.length; i++) System.out.print(arr[i] + " ");
        
    }
    
}