class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String s = "" + x;
        int origin = x;
        int length = s.length();
        int sum = 0;
        for(int i = 0; i < length; i++) {
            sum += x % 10;
            x /= 10;
        }
        if(origin % sum == 0)
            answer = true;
        else
            answer = false;
            
        return answer;
    }
}