class Solution {
    public String solution(String phone_number) {
        String answer = "";
        int length = phone_number.length();
        StringBuilder sb = new StringBuilder(phone_number);
        
        for(int i = 0; i < length - 4; i++){
            sb.setCharAt(i, '*');
        }
        answer = sb.toString();
        return answer;
    }
}