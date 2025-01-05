import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};
        
        // id 별 신고당한 횟수
        Map<String, Integer> reportedNum_by_id = new HashMap<>();
        for(String id : id_list){
            reportedNum_by_id.put(id,0);
        }
                       
        // 중복으로 신고한 경우 제거
        Set<String> report_set = new HashSet<>();
        for(String r : report){
            report_set.add(r);
        }
        
         // id 별 신고한 유저 Map<신고한 유저id, 신고당한 유저id List>
        Map<String, List<String>> reportList_by_id = new HashMap<>();
        for(String id : id_list){
            reportList_by_id.put(id,new ArrayList<>());
        }
        
        // report 신고한id, 신고당한id 분리
        for(String r : report_set){
            String[] r_ = r.split(" ");
            reportList_by_id.get(r_[0]).add(r_[1]);
        }
        
        // 유저별 신고 list 가져와, 신고당한 횟수 count
        for(List<String> r_list : reportList_by_id.values()){
            for(String r : r_list){
                 reportedNum_by_id.put(r, reportedNum_by_id.get(r) + 1);
            }
        }
        System.out.println(reportedNum_by_id.toString());
        
        // id 별 메일 받는 횟수
        answer = new int[id_list.length];
        
        for(int i=0; i<id_list.length; i++){
            // 유저별 신고 list에서 정지된 id만 count
            for(String reported_id : reportList_by_id.get(id_list[i])){
                if(reportedNum_by_id.get(reported_id) >= k){
                    answer[i]++;
                }
            }
        }
        
        return answer;
    }
}