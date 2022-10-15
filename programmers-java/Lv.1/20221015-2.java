import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int cnt = 0;
        
        List<Integer> as = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % divisor == 0) {
                as.add(arr[i]);
                // System.out.println("arr 숫자 추가:" + as);
                cnt++;
            }
        }
        if (cnt == 0){
            as.add(-1);
        }
        
        int[] answer = new int[as.size()];
        for(int i = 0; i < as.size(); i++) {
            answer[i] = as.get(i);
        }
        
        return answer;
    }
}