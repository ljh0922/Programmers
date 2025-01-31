class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int t_len = t.length();
        int p_len = p.length();
        
        for(int i=0; i<=t_len-p_len; i ++){
            String t_sub = t.substring(i,i+p_len);
            long t_int = Long.valueOf(t_sub);
            long p_int = Long.valueOf(p);
            
            if(t_int <= p_int) answer++;
        }
        
        return answer;
    }
}