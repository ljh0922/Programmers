import java.util.*;

class Solution {
    public List<Integer> solution(int[] answers) {
        int[] result = new int[3];
        int[][] patterns = new int[3][];
        patterns[0] = new int[]{1, 2, 3, 4, 5};
        patterns[1] = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        patterns[2] = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int max_result = result[0];
        List<Integer> winner = new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> testers = new ArrayList<>(); 
        
        for(int i=0; i<answers.length; i++)
            for(int j=0; j<result.length; j++)
                if(patterns[j][i%patterns[j].length]==answers[i]) result[j]++;
        
        for(int r : result) if(max_result<r) max_result=r;
        for(int i=0; i<result.length; i++)
            if(max_result==result[i]) winner.add(i+1);
        return winner;
    }
}