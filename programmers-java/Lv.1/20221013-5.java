class Solution {
    public int solution(int n) {
        int answer = 0;
        // System.out.println(10%3);
        for(int i = 2; i < n; i++) {
            if(n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}