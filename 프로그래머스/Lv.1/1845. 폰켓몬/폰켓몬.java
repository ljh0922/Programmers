import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Map<Integer,Integer> p = new HashMap<>();
        // 포켓몬 종류만 있는 해쉬맵 생성
        for(int n : nums){
            if(!p.containsKey(n)){
                p.put(n,1);
            }
        }
        
        // 종류와 가질 수 있는 수 비교
        if(p.size()>=nums.length/2) answer = nums.length/2;
        else answer = p.size();
        return answer;
    }
}