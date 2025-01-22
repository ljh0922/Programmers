class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int long_w = wallet[0]>=wallet[1]? wallet[0]:wallet[1];
        int short_w= wallet[0]>=wallet[1]? wallet[1]:wallet[0];
        
        int long_b = bill[0]>=bill[1]? bill[0]:bill[1];
        int short_b = bill[0]>=bill[1]? bill[1]:bill[0];
        
        while(long_w < long_b || short_w < short_b){
            answer++;
            long_b /= 2;
            if(long_b<short_b){
                int temp = long_b;
                long_b = short_b;
                short_b = temp;                    
            }
        }
        
        
        return answer;
    }
}