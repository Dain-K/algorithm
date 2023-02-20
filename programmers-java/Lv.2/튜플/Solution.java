import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(String s) {
        Map<Integer, Integer> map = new HashMap<>();
        s = s.replaceAll("[{,}]", " ");
        String[] input = s.split("[ ]+");
        for(int i = 0; i < input.length; i++) {
            if(!input[i].equals("")) map.put(Integer.parseInt(input[i]), map.getOrDefault(Integer.parseInt(input[i]), 0) + 1);
        }
        List<Integer> keyset = new ArrayList<>(map.keySet());
        keyset.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        int[] answer = new int[keyset.size()];
        for(int i = 0; i < keyset.size(); i++) {
            answer[i] = keyset.get(i);
        }
        return answer;
    }
}