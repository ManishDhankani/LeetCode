//https://leetcode.com/problems/backspace-string-compare/
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack s1 = new Stack();
        Stack s2 = new Stack();
        for(char ch1: S.toCharArray()){
            if(ch1 == '#' && !s1.isEmpty()){
                s1.pop();
            }else if(ch1 != '#'){s1.push(ch1);}
        }
        for(char ch2: T.toCharArray()){
            if(ch2 == '#' && !s2.isEmpty()){
                s2.pop();
            }else if(ch2 != '#'){s2.push(ch2);}
        }
        if(s1.size() != s2.size())
            return false;
        while(!s1.isEmpty() && !s2.isEmpty()){
            if((char)s1.pop() != (char)s2.pop())
                return false;
        }
        return true;
    }
}