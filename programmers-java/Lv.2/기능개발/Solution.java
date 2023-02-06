import java.util.Queue;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

class Solution {
    static int input;
    
    public int[] solution(int[] progresses, int[] speeds) {  
        List<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < progresses.length; i++) {
            input = (100 - progresses[i]) / speeds[i];
            if((100 - progresses[i]) % speeds[i] != 0) {
                q.add(input + 1);
            } else q.add(input);
        }
        int max = q.poll(); // 제일 처음 값
        int cnt = 1;
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            if(q.peek() > max) {
                ans.add(cnt);
                cnt = 1;
                max = q.poll();
            } else{
                cnt++;
                q.poll();
            }
        }
        ans.add(cnt);
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}