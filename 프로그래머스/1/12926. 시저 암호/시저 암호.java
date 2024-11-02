import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        List<Character> s_arr = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            char s_ = s.charAt(i);
            if(s_ == ' ') {
                   s_arr.add(s_);                 
                continue;
            }
            else if(65 <= s_ && s_ <= 90){
                if(s_+n > 90)s_arr.add((char)(s_+n-26));
                else s_arr.add((char)(s_+n));
            }
            else{
                if(s_+n > 122)s_arr.add((char)(s_+n-26));
                else s_arr.add((char)(s_+n));
            }
            
            
        }
        
        for(char s_ : s_arr){
            answer += String.valueOf(s_);
        }

        
        return answer;
    }
}