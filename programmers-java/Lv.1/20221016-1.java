class Solution {
    public String solution(String s) {
        String answer = "";
        char ch = s.charAt(0);
        if(s.length() % 2 == 0){
            ch = s.charAt((s.length()-1) / 2);
            answer = String.valueOf(ch);
            ch = s.charAt((s.length()-1) / 2 + 1);
            answer += String.valueOf(ch);
        }else{
            ch = s.charAt(s.length() / 2);
            answer = String.valueOf(ch);
        }
        System.out.println(ch);
        return answer;
    }
}