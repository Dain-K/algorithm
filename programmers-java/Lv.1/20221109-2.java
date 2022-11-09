class Solution {
    public String solution(String s) {
        String answer = "";
        String[] alpha = s.split("");
        int index = 0;
        for(int i = 0; i< alpha.length; i++){
            if(alpha[i].equals(" ")){
                answer += alpha[i];
                index = 0;
            }
            else if(index % 2 == 0){
                answer += alpha[i].toUpperCase();
                index++;
            }
            else if(index % 2 != 0) {
                answer += alpha[i].toLowerCase();
                index++;
            }
        }
        return answer;
    }
}