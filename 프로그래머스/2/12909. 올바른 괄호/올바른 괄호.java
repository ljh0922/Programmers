import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        
        int cnt=0;
        if(s.charAt(0)==')'||s.charAt(s.length()-1)=='(') {
            return false;
        }
            
        for(char ss : s.toCharArray()){
            if(ss==')'&&stack.size()==0) return false;
            
            if(ss=='(') stack.push(ss);
            else stack.pop();
        }
       
        return stack.size()!=0? false : true;
    }
}