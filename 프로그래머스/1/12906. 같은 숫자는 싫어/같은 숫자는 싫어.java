import java.util.*;

public class Solution {
    public Integer[] solution(int []arr) {
        int[] answer = {};
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i<arr.length-1; i++ ){
            if(arr[i]!=arr[i+1]) stack.push(arr[i]);
        }
        stack.push(arr[arr.length-1]);
        

        return stack.toArray(new Integer[stack.size()]);
    }
}