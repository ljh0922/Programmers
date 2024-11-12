import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<Character> s_arr = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++){
            s_arr.add(s.charAt(i));
        }
        
        for(char s_ : s_arr){
            for(int i=0; i<index; i++){
                s_++;
                if(s_>'z'){
                    s_ -= 26;
                }
                while(skip.contains(String.valueOf(s_))){
                    s_++;           
                    if(s_>'z'){
                       s_ -= 26;
                    }    
                }
                
                              
            }
            System.out.println(s_);
            answer += String.valueOf(s_);
        }
        
        System.out.println((int)('a'));
        // 123 => 97(a)
        return answer;
    }
}