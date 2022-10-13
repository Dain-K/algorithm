class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        long first = 0;
        long second = 0;
        int length = 0;
        
        if(a > b){
            first = a;
            second = b;
            length = a-b;
        }
        else{
            first = b;
            second = a;
            length = b-a;
        }
        for(int i = 0; i <= length; i++) {
            answer += second + i;
        }
        return answer;
    }
}