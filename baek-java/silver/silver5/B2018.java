package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2018
{
   
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int start_point = 1;
        int end_point = 1;
        int answer = 0;
        int sum = 1;
        
        while(start_point <= end_point) {
           if(sum == N) {
              answer++;
              sum -= start_point;
              start_point++;
           }
           else if(sum < N) {
              end_point++;
              sum += end_point;
           }
           else if(sum > N) {
              sum -= start_point;
              start_point++;
           }
        }
        System.out.println(answer);
        
    }
    
}