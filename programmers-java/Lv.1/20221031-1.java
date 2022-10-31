class Solution {
    public String solution(int a, int b) {
        int sum = 0;
        String[] day = {"FRI", "SAT", "SUN","MON", "TUE", "WED", "THU"};
        int[] date = {31,29,31,30,31,30,31,31,30,31,30,31};
        for(int i = 0; i < a - 1; i++){
            sum += date[i];
        }
        sum += b - 1;

        return day[sum%7];
    }
}