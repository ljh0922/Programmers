class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int cnt=0;
        if(s.charAt(0)==')'||s.charAt(s.length()-1)=='(') {
            answer = false;
        }
        else{
            for(char ss : s.toCharArray()){
                 cnt += ss=='('? 1:-1;
                if(cnt<0) return false;
            }
            answer = (cnt==0)? true:false;
        
        }

        return answer;
    }
}