import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int[] remainDays = new int[progresses.length];
        
        for(int i=0; i<progresses.length; i++){
             remainDays[i] = (100-progresses[i])%speeds[i]>0 ?  (100-progresses[i])/speeds[i]+1 : (100-progresses[i])/speeds[i];
        } 
        
        int cnt = 0;
        int max = remainDays[0];
        for(int r : remainDays){
            if(max<r){
                max = r;
                answer.add(cnt);
                cnt = 1;
            }
            else{
                cnt++;
            }
        }
        answer.add(cnt);
        
        return answer;
    }
}