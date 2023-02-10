class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int start = 0;
        Long compareP = Long.parseLong(p);

        while(true) {
            String k = t.substring(start, p.length() + start);
            if(Long.parseLong(k) <= compareP) answer++; 
            start++;
            if(p.length() + start > t.length()) break;
        }
        return answer;
    }
}