https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/
class Solution {
    public int minAddToMakeValid(String S) {
        Stack stack = new Stack();
        for(char c: S.toCharArray()){
            if(c == '('){
                stack.push(c);
            }else if(c == ')'){
                if(!stack.isEmpty() && (char)stack.peek() == '(')
                    stack.pop();
                else {stack.push(c);}
            }
        }
        return stack.size();
    }
}