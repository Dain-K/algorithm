import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int length = (int)(Math.log10(n) + 1);
        
        for(int i = 1 ; i <= length; i++) {
            if(i == 1) {
                answer = n % 10;
            }
            else{
                n = n / 10;
                answer = answer + (n % 10);
                System.out.println(answer);
            }                           
        }
        return answer;
    }
}