class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for(int j=0; j<nums.length-1; j++)
            for(int i=0; i<nums.length-1-j; i++){
                if(nums[j]==nums[i+j+1])
                    nums[i+j+1]=0;
                
            }
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                continue;         
            else
                if(answer<(nums.length/2))
                    answer++;
                else
                    break;
        }
        
        return answer;
    }
}