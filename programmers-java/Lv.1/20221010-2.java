class Solution {
    public String solution(int num) {
        String answer = "";
        int temp = num % 2;
        if(temp == 0) {
            answer = "Even";
        }
        else{
            answer = "Odd";
        }
        return answer;
    }
}