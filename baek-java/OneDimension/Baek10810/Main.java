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
        
        int N = Integer.parseInt(st.nextToken()); // 바구니의 번호
        int M = Integer.parseInt(st.nextToken()); // 반복횟수
        int[] arr = new int[N];
        
        for(int z = 0; z < M; z++) {
        	StringTokenizer ijk = new StringTokenizer(br.readLine());
        	int i = Integer.parseInt(ijk.nextToken());
        	int j = Integer.parseInt(ijk.nextToken());
        	int k = Integer.parseInt(ijk.nextToken());
        	for(int a = i; a <= j; a++) {
        		arr[a - 1] = k;
        	}
        }
        
        for(int i: arr) {
        	System.out.print(i + " ");
        }
    }
    
    
}