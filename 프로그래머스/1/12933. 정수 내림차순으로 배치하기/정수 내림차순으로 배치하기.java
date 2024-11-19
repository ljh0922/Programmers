import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String n_str = String.valueOf(n);
        String[] n_str_arr = n_str.split("");
        
        int[] n_arr = new int[n_str_arr.length];
        
        for(int i=0; i<n_str_arr.length; i++){
            n_arr[i] = Integer.valueOf(n_str_arr[i]);
        }
        
        Arrays.sort(n_str_arr, Collections.reverseOrder());
        
        n_str = "";
        for(String n_ : n_str_arr){
            n_str += n_;
        }
        
        answer = Long.valueOf(n_str);
            
        return answer;
    }
}