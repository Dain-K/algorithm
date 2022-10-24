import java.util.Arrays;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int index = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // System.out.println(nums[i]);
            if(nums[i] != index){
                answer+=1;
                index = nums[i];
            }
            if (answer == nums.length / 2){
                break;
            }
        }
        return answer;
    }
}