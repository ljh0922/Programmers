import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        int[] remainDays = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++){
             remainDays[i] = (100-progresses[i])%speeds[i]>0 ?  (100-progresses[i])/speeds[i]+1 : (100-progresses[i])/speeds[i];
        } 
        
        
        for(int r : remainDays){
            if(!q.isEmpty()&&q.peek()<r){
                answer.add(q.size());
                q.clear();
            }
            q.offer(r);
            
        }
        answer.add(q.size());
        
        return answer;
    }
}
