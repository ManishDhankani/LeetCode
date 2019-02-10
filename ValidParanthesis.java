https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack stack = new Stack();
        for(char ch: s.toCharArray()){
            if(ch == '(' || ch == '[' || ch == '{')
                stack.push(ch);
            else if(ch == ')'){
                if (!stack.isEmpty() && (char)stack.peek() == '(')
                    stack.pop();
                else return false;
            }
            else if(ch == ']'){
                if (!stack.isEmpty() && (char)stack.peek() == '[')
                    stack.pop();
                else return false;
            }
            else if(ch == '}'){
                if ( !stack.isEmpty() && (char)stack.peek() == '{')
                    stack.pop();
                else return false;
            }
        }
        return (stack.isEmpty());
    }
}