import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        int cnt = 0;
        String answer = "";
        
        //완주한 선수 명단 해쉬맵 생성 <완주자이름,인원수>
        Map<String,Integer> completions = new HashMap<>();
        
        for(String c : completion){
            if(!completions.containsKey(c))
                completions.put(c,1);
            else
                // 동명이인 존재할 경우
                completions.replace(c,completions.get(c)+1);
        }
        
        //완주자 명단 존재 여부 확인
        for(String p : participant){
            if(completions.containsKey(p)&&completions.get(p)!=0)
                completions.replace(p,completions.get(p)-1);
            else
                answer = p;
        }
        
        
        //for 문 사용 풀이 효율성 낮음
//         int cnt = 0;
//         for(String p:participant){
//             cnt = 0;
//             for(String p_:participant){
//                 if(p.equals(p_))
//                     cnt++;
//             }
            
//             for(String c:completion){
//                 if(p.equals(c))
//                     cnt--;
                
//                 if(cnt==0)
//                     break;
//             }
            
//             if(cnt!=0)
//                 answer = p;
//         }
        
        
        return answer;
    }
}