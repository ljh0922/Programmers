class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int index_1=0;
        int index_2=0;
        for(String g : goal){
            
            if(index_1<cards1.length && cards1[index_1].equals(g)) index_1++;
            else if(index_2<cards2.length && cards2[index_2].equals(g)) index_2++;
            else return "No" ;
           
        }
        
        return answer;
    }
}