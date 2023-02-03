package 가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        String[] stringNum = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            stringNum[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNum, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return (o2+o1).compareTo(o1+o2);
            }
        });
        for(String s: stringNum){
            answer += s;
        }
        
        if(stringNum[0].equals("0")) answer = "0";

        return answer;
    }
}