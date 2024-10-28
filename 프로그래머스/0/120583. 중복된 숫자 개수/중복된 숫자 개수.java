class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for(int a: array){
            answer += (a==n)?1:0;
        }
        
        return answer;
    }
}