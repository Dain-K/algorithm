import java.util.List;
import java.util.ArrayList;

class Solution {
    public String solution(int n) {
        String answer = "";
        for(int i = 0; i < n; i++) {
            if(i % 2 == 0)
                //list.add("수");
                answer += "수";
            else
                //list.add("박");
                answer += "박";
        } 
        return answer;
    }
}