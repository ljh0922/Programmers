class Solution {
    public int solution(String s) {
        int answer = 0;
        
        if(s.substring(0,1).equals("-")){
            answer = -1* Integer.valueOf(s.substring(1));
        }
        else if(s.substring(0,1).equals("+")){
            answer = Integer.valueOf(s.substring(1));
        }
        else answer = Integer.valueOf(s);
        
        return answer;
    }
}