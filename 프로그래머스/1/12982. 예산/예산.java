import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        //신청금 배열 정렬
        Arrays.sort(d);
        
        // 작은 수 부터 누적
        for(int i=0; i<d.length; i++){
            sum += d[i];
            answer = i;
            // i가 0부터 시작이므로 그냥 break
            if(sum>budget) {
                break;
            }
            // i가 0부터 시작이므로 예산에 딱 맞거나, 다 더해도 예산보다 작은경우 +1
            else if(sum==budget || i==d.length-1) {
                answer++;
                break;
            }
        }
        
        return answer;
    }
}