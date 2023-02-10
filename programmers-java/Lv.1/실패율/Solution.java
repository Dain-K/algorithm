package 실패율;

import java.util.PriorityQueue;
import java.util.Collections;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        double total = stages.length;
        double[] p = new double[N + 2];
        double[] percent = new double[N + 2];
        PriorityQueue<Double> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i = 0; i < stages.length; i++) {
            p[stages[i]]++;
        }
        for(int i = 1; i <= N; i++) {
            if(total > 0) percent[i] = p[i] / total * 100;
            total = total - p[i];
            pq.add(percent[i]);
        }
        int j = 0;
        int i = 1;
        while(!pq.isEmpty()) {
            if(pq.peek() == percent[i]) {
                pq.poll();
                answer[j] = i;
                percent[i] = -1;
                j++;
                i = 1;
            } else i++;
        }
        return answer;
    }
}