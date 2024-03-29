import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(!stack.empty() && stack.peek() == ch) stack.pop();
            else stack.push(ch);    
        }
        if(stack.empty()) return 1;
        else return 0;
    }
}