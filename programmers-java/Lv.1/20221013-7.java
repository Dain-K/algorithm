import java.util.Arrays;
class Solution {
    public String solution(String[] seoul) {
        String answer = "";
        int location = 0;
        
        for(int i = 0; i < seoul.length; i++) {
            if(Arrays.asList(seoul[i]).contains("Kim") == true){
                location = i;
                answer = "김서방은 " + i +"에 있다";
                break;
            }
        }
        
        return answer;
    }
}
