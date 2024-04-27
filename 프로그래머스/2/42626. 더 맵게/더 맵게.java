import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> s = new PriorityQueue<>();
        
        // List 변환
        for(int s_ : scoville){
            s.add(s_);
        }
        
        if(s.peek() >= K){
            return 0;    
        }
        
        Integer min1=0;
        Integer min2=0;
        for(int i=1; s.size()>=2 ; i++){
            
            min1 = s.poll();
            min2 = s.poll();
            
            int newOne = min1 + (min2*2);
            s.add(newOne);
            
            if(s.peek() >= K){
                answer = i;
                break;
            }
            else answer = -1;         
            
        }
        
        return answer;
    }
}