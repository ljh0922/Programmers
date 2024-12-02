import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        
        List<Integer> answer = new ArrayList<>();     
        
        for(int[] cmd_arr1 : commands){
            List<Integer> cut_arr = new ArrayList<>();     
            for(int i=cmd_arr1[0]-1; i<cmd_arr1[1]; i++){
                cut_arr.add(array[i]);
            }
            Collections.sort(cut_arr);
            System.out.println(cut_arr.toString());
           answer.add(cut_arr.get(cmd_arr1[2]-1));
        }
        
        
        
        return answer;
    }
}