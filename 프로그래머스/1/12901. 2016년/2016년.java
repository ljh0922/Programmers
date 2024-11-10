class Solution {
    public String solution(int a, int b) {
        String answer = "";
        
        int days = 0;
        
        if(a<=2){
            days = (a-1)*30 + a/2 + b - 1;
        }
        
        if(2<a && a<8){
            days = (a-1)*30 + a/2 + b - 2;
        }
        
        if(a>=8){
            days = (a-1)*30 + (a+1)/2 + b - 2;
        }
        
        
        int cycle = (days)%7;
        
        if(cycle==0) answer = "FRI";
        if(cycle==1) answer = "SAT";
        if(cycle==2) answer = "SUN";
        if(cycle==3) answer = "MON";
        if(cycle==4) answer = "TUE";
        if(cycle==5) answer = "WED";
        if(cycle==6) answer = "THU";
        
        System.out.println(days);
        // 2, /8 10 12
        
        return answer;
        
        
        
        //2/29
    }
}