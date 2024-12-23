import java.util.*;

class Solution {
    public  Set<Integer> solution(int[] numbers) {
              
        Arrays.sort(numbers);
        Set<Integer> numbers_set = new HashSet<>();
        
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                numbers_set.add(numbers[i]+numbers[j]);
            }
        }
        
         numbers_set = new TreeSet<>(numbers_set);
        
        return numbers_set;
    }
}