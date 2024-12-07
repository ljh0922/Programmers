import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(!(s.length()==4 || s.length()==6)) return false;
        
        char[] s_arr = s.toCharArray();
        for(char s_ : s_arr){
            if(s_>'9') return false;
        }
        
        
        return answer;
    }
}