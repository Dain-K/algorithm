package 귤_고르기;

import java.util.Arrays;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Arrays.sort(tangerine);
        int[] count = new int[tangerine[tangerine.length - 1] + 1];
        for(int i = 0; i < tangerine.length; i++) {
            count[tangerine[i]]++;
        }
        Arrays.sort(count);
        int index = count.length - 1;
        while(true) {
            k -= count[index];
            index--;
            answer++;
            if(k <= 0) break;
            
        }
        return answer;
    }
}