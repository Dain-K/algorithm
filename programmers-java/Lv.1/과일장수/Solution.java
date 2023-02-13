package 과일장수;

import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int cnt = 0;
        Arrays.sort(score);
        for(int i = 0; i < score.length; i++) {
            cnt++;
            if(cnt == m) {
                answer += score[score.length - i - 1] * m;
                cnt = 0;
            }
        }
        
        return answer;
    }
}