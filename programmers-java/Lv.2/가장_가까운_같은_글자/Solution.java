import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(map.containsKey(String.valueOf(c))) {
                answer[i] = i - map.get(String.valueOf(c));
                map.put(String.valueOf(c), i);
            } 
            else{
                answer[i] = -1;
                map.put(String.valueOf(c), i);
            }
        }
        return answer;
    }
}