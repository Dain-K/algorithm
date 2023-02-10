package 완주하지_못한_선수;

import java.util.Map;
import java.util.HashMap;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(String s: participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for(String s: completion) {
            map.put(s, map.getOrDefault(s, 0) - 1);
            if(map.get(s) == 0) map.remove(s);
        }
        for(String s: map.keySet()) answer += s;        
        
        return answer;
    }
}