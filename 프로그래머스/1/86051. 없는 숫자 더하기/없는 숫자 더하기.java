import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        List<Integer> n_arr = new ArrayList<>();
                
        for(int n_ : numbers){
            n_arr.add(n_);
        }
        
        for(int i=0; i<10; i++){
            if(!n_arr.contains(i)) answer += i;
        }
        
        
        return answer;
    }
}