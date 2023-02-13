package 최소직사각형;

import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int[] width = new int[sizes.length];
        int[] height = new int[sizes.length];
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                width[i] = sizes[i][0];
                height[i] = sizes[i][1];
            } else {
                width[i] = sizes[i][1];
                height[i] = sizes[i][0];
            }
        }
        Arrays.sort(width);
        Arrays.sort(height);
        
        return width[sizes.length - 1] * height[sizes.length - 1];
    }
}