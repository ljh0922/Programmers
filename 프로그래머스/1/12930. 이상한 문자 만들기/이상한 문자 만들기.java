import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] s_arr = s.split(" ",-1);
        
        
        for(String s_ : s_arr){
            System.out.println(s_);
            for(int i=0; i<s_.length(); i++){
                if(i%2==0){
                    answer += String.valueOf(Character.toUpperCase(s_.charAt(i)));
                }
                else{
                    answer += String.valueOf(Character.toLowerCase(s_.charAt(i)));
                }
            }
            answer += " ";
        }
        answer = answer.substring(0,answer.length()-1);
        
        
        
                
        
        return answer;
    }
}