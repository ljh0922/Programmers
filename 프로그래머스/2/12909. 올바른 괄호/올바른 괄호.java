import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ss : s.toCharArray()){
            if(ss==')'&&stack.size()==0) return false;
            
            if(ss=='(') stack.push(ss);
            else stack.pop();
        }
       
        return stack.size()!=0? false : true;
    }
}