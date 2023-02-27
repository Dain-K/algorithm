class Solution {
    public int solution(int n) {
        String s = Integer.toString(n, 3);
        String result = "";
        for(int i = 0; i < s.length(); i++) {
            result += s.charAt(s.length() - i - 1);
        }
        return Integer.parseInt(result, 3);
    }
}