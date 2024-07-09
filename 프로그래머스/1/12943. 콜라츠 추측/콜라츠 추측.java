class Solution {
    public int solution(int num) {
        int answer = 0;
        
        if(num==1){
            return 0;
        }

        long lnum = (long) num;
        for(int i=1; i<=500; i++ ){
            lnum = (lnum%2==0)? lnum/2 : lnum*3+1;
            
            if(lnum==1){
                return i;
            }
        }
        
        return -1;
    }
}