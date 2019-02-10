//https://leetcode.com/problems/baseball-game/
class Solution {
    public int calPoints(String[] ops) {
        Stack stack = new Stack();
        int sum = 0;
        for(String s: ops){
            if(s.equals("C")){
                sum -= (int)stack.pop();
            }else if(s.equals("D")){
                int value = (int)stack.peek();
                sum += value*2;
                stack.push(value*2);
            }else if(s.equals("+")){
                int current = (int)stack.pop();
                int total = 0;
                total += current;
                total += (int)stack.peek();
                stack.push(current);
                stack.push(total);
                sum += total;
            }else{
                stack.push(Integer.parseInt(s));
                sum += Integer.parseInt(s);
            }
        }
        return sum;
    }
}