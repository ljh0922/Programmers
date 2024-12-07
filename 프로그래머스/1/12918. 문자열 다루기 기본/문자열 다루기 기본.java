import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        
        String A = "가나다 = \"A\" ";
        
        if(s.length()==4 || s.length()==6) answer = true;
        
        char[] s_arr = s.toCharArray();
        
        for(char s_ : s_arr){
            if(s_>'9') return false;
        }
        
        
        System.out.print(A);
        
        return answer;
    }
}