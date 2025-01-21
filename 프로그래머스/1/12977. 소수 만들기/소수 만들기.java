class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");
        
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    int divCnt = 0;
                    
                    for(int l=1; l<=sum; l++){
                        if(sum%l==0) divCnt++;
                    }
                    
                    if(divCnt==2) answer++;
                }
            }
        }
        

        return answer;
    }
}