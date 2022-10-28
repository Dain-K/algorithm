class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int cnt = 0;
        int tmp = 0;
        int[] rank = {6,5,4,3,2,1};
        for(int i =0; i<lottos.length;i++){
            for(int j = 0; j <win_nums.length;j++) {
                if(lottos[i] == 0) {
                    tmp++;
                    break;
                }
                if(lottos[i] == win_nums[j]){
                    cnt++;
                    break;
                }
            }
        }
        for(int i = 0; i < rank.length;i++){
            if(cnt == 0) {
                answer[1] = 6;
            }
            if(cnt+tmp == 0) {
                answer[0] = 6;
            }
            if(rank[i] == cnt){
                answer[1] = i+1;
            }
            if(rank[i] == cnt+tmp) {
                answer[0] = i+1;
            }
        }
        
        return answer;
    }
}