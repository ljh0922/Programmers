class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        
        String revers = "";
        for(int i=0; i<myString.length(); i++){
            revers += myString.substring(i,i+1).equals("A")? "B":"A";
        }
        System.out.println(revers);
        answer = revers.indexOf(pat)==-1? 0:1;
        
        return answer;
    }
}