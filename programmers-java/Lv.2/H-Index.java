import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            int size = citations.length - i; // 인용 횟수
            
            if(citations[i] >= size) {
                answer = size;
                break;
            }
            
        }
        return answer;
    }
}