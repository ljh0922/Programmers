class Solution {
    public int solution(String t, String p) {
        int answer = 0; 
        int p_len = p.length();
        long p_long = Long.parseLong(p);
        long t_sub = 0;
        long divisor = (long) Math.pow(10, p_len - 1);

        for (int i = 0; i < t.length(); i++) {
            t_sub = t_sub * 10 + (t.charAt(i) - '0'); // 숫자 추가
            if (i >= p_len - 1) { // p_len 길이 이상일 때 비교
                if (t_sub <= p_long) answer++;
                t_sub -= (t.charAt(i - p_len + 1) - '0') * divisor; // 맨 앞 자리 제거
            }
        }
        return answer;
    }
}
