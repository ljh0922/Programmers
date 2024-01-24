import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String,Integer> c = new HashMap<>();
        
        for(String[] c_ : clothes){
           if(!c.containsKey(c_[1])) 
               c.put(c_[1],1);
            else
                c.replace(c_[1],c.get(c_[1])+1); 
        }
        
        for(Integer nums : c.values()){
            answer *= (nums+1);
        }
        
        return answer-1;
    }
}