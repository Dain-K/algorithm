package Math;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978_소수찾기
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        
        for(int i = 0; i < N; i++) {
        	int num = Integer.parseInt(st.nextToken());
        	int count = 0;
        	for(int j = 1; j <= num; j++) {
        		if(num % j == 0) count++;
        	}
        	if(count == 2) result++;
        	
        }
        System.out.println(result);
        
    }
    
}