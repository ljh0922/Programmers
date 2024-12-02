import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        Arrays.sort(d);
        
        for(int i=0; i<d.length; i++){
            sum += d[i];
            answer = i;
            if(sum>budget) {
                break;
            }
            else if(sum==budget || i==d.length-1) {
                answer++;
                break;
            }
        }
        
        return answer;
    }
}