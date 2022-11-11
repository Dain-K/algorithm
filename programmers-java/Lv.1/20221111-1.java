class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        int[] countX = new int[10];
        int[] countY = new int[10];
        
        countNum(X, countX);
        countNum(Y, countY);
        
        for(int i = countX.length - 1; i >= 0; i--){
            while(countX[i] >= 1 && countY[i] >= 1) {
                countX[i]--;
                countY[i]--;
                answer.append(i);
            }
        }
        if(answer.toString().equals("")){
            return "-1";
        }else if(answer.toString().startsWith("0")){
            return "0";            
        }else{
            return answer.toString();
        }
    }
    
    private void countNum(String str, int[] arr){
        for(int i = 0; i< str.length(); i++){
            int index = str.charAt(i) - '0';
            arr[index]++;
        }
    }
}