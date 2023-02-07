import java.util.HashSet;

class Solution {
    public int solution(int[] elements) {
        int cnt = 1;
        HashSet<Integer> set = new HashSet<>();
        while(cnt < elements.length + 1) {
            for(int i = 0; i < elements.length; i++) {
                int sum = elements[i];
                for(int j = i+1; j < i + cnt; j++){
                    if(j >= elements.length) {
                        sum += elements[j - elements.length];
                    } else sum += elements[j];
                }
                set.add(sum);
            }
            cnt++;
        }
        return set.size();
    }
}