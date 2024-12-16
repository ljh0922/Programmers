import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int[] arr) {
               
        int length = arr.length;
        
        if(length == 1 ){
            ArrayList<Integer> answer = new ArrayList<>();
            answer.add(-1);
            return answer;
        }
        
        int min = arr[0];
        int index = 0;
        for(int i=0; i<length; i++){
            if(arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0; i<length; i++){
            if(i == index) continue;
            
            answer.add(arr[i]);
        }
        
        
        return answer;
    }
}