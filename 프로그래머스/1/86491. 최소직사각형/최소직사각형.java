import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxW = 0;
        int maxH = 0;
        int temp = 0;
        
        for(int[] ss: sizes){
            maxW = Math.max(maxW,Math.max(ss[0],ss[1]));
            maxH = Math.max(maxH,Math.min(ss[0],ss[1]));
        }
        
        return maxW*maxH;
    }
}