import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        String s = "" + n; 
        int length = s.length();
        int[] arr = new int[length];
        
        for(int i = 0; i < length; i++) {
            arr[i] = (int)(n % 10);
            n /= 10;
        }
        Arrays.sort(arr);
        
        for(int j = 0; j < length; j++){
            // System.out.println(arr[j]);
            answer += arr[j] * Math.pow(10, j);
        }
        return answer;
    }
}