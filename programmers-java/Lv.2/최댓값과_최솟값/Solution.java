package 최댓값과_최솟값;

import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sNum = s.split(" ");
        int[] num = new int[sNum.length];
        
        for(int i = 0; i < sNum.length; i++){
            num[i] = Integer.valueOf(sNum[i]);
        }
        Arrays.sort(num);
        
        answer += num[0] + " " + num[sNum.length-1];
        
        return answer;
    }
}