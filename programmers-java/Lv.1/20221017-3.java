class Solution {
    public long solution(long n) {
        long answer = 0;
        for(int i = 1; i <= n; i++) {
            if(Math.pow(i, 2) == n){
                long temp = i + 1;
                answer = temp * temp;
                break;
            }
            if(i*i > n){
                answer = -1;
                break;
            }
        }
        return answer;
    }
}