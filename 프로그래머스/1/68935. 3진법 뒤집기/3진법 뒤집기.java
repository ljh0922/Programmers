import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        Stack<Integer> r = new Stack<>();
        
        for(;n>=3;){
            r.push(n%3);
            n /= 3;
        }
        r.push(n);
        
        int size = r.size();
        for(int i=0; i<size; i++){
            answer += r.pop()*Math.pow(3,i);
        }
                   
        return answer;
    }
}