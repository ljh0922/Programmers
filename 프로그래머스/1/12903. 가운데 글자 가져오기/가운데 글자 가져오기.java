class Solution {
    public String solution(String s) {
        String answer = "";
        
        int half = s.length()/2;
            
        answer = s.substring(half*2==s.length()? half-1 : half, half+1);
        
        
        
        return answer;
    }
}