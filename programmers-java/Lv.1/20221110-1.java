class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        long plus = 0; 
        int len = 0;
        String blank = " ";
        for(int i = 0; i < n; i++) {
            plus = Long.parseLong(Integer.toBinaryString(arr1[i])) + Long.parseLong(Integer.toBinaryString(arr2[i]));
            answer[i] = "";
            len = (int)(Math.log10(plus)+1);
            for(int j = 0; j < len; j++){
                if(plus % 10 == 0){
                    answer[i] = " " + answer[i];
                }
                else {
                    answer[i] = "#"+ answer[i];
                }
                plus = plus / 10;
            }
            if(len != n) {
                answer[i] = blank.repeat(n - len) + answer[i];
            }
        }
        return answer;
    }
}