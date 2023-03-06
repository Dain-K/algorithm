import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
	
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int TestCase = Integer.parseInt(br.readLine());
        
        // 에라토스테네스의 체
        // false 인 경우 소수 !!
        boolean[] num = new boolean[10001];
        for(int i = 2; i <= Math.sqrt(10000); i++) {
        	for(int j = i + i; j <= 10000; j += i) {
        		num[j] = true; // 소수가 아님
        	}
        }
        
        for(int i = 0; i < TestCase; i++) {
        	int n = Integer.parseInt(br.readLine());
        	for(int j = n/2; j >= 2; j--) {
        		if(!num[j] && !num[n - j]) {
        			System.out.println(j + " " + (n-j));
        			break;
        		}
        			
        	}
        }
        
    }
    
}