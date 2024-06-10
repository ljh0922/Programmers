import java.util.*;

class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        
        List<Map<String,Object>> songList = new ArrayList<>();{
            
        }
        Set<String> genreSet = new HashSet<>();
        
        for(int i=0; i<genres.length; i++){
            // 입력 노래들 맵으로 키값화
            Map<String,Object> song = new HashMap<>();
            song.put("id",i);
            song.put("genre",genres[i]);
            song.put("plays",plays[i]);
            
            // 장르 set 추가
            genreSet.add(genres[i]);
            
            // 입력 노래들 리스트 추가
            songList.add(song);
        }
        
        // 장르별 정보 ex.총재생횟수, 1,2위
        List<Map<String,Object>> genreInfoList = new ArrayList<>();
        for(String genre : genreSet){
            Map<String,Object> genreInfo = new HashMap<>();
            genreInfo.put("genre" , genre);
            genreInfo.put("Max1Id" , null);
            genreInfo.put("Max2Id" , null);
            int totalPlays = 0;
            int Max1 = 0;
            int Max2 = 0;
            
            for(Map<String,Object> song : songList){
                if(!genre.equals((String)song.get("genre")))
                    continue;
                
                 totalPlays += (Integer)song.get("plays");
                
                if(Max1 < (Integer)song.get("plays") || (((Integer)genreInfo.get("Max1Id") > (Integer)song.get("id")) && Max1 == (Integer)song.get("plays"))) {
                    Max2 = Max1;
                    genreInfo.put("Max2Id" , genreInfo.get("Max1Id"));
                    
                    Max1 = (Integer)song.get("plays");
                    genreInfo.put("Max1Id" , song.get("id"));
                }
                else if(Max2 < (Integer)song.get("plays") || (((Integer)genreInfo.get("Max2Id") > (Integer)song.get("id")) && Max2 == (Integer)song.get("plays")) ){
                    Max2 = (Integer)song.get("plays");
                    genreInfo.put("Max2Id" , song.get("id"));
                }
            }
            
            genreInfo.put("totalPlays" , totalPlays);
            
            genreInfoList.add(genreInfo);
        }
        
        for (int i = 0; i < genreInfoList.size() - 1; i++) {
            for (int j = 0; j < genreInfoList.size() - 1 - i; j++) {
                Integer plays1 = (Integer) genreInfoList.get(j).get("totalPlays");
                Integer plays2 = (Integer) genreInfoList.get(j + 1).get("totalPlays");

                if (plays1 < plays2) {
                    Map<String, Object> temp = genreInfoList.get(j);
                    genreInfoList.set(j, genreInfoList.get(j + 1));
                    genreInfoList.set(j + 1, temp);
                }
            }
        }        
        
        List<Integer> answer = new ArrayList<>();
        for(Map<String, Object> genreInfo : genreInfoList){
            answer.add((Integer)genreInfo.get("Max1Id"));
            
            if(genreInfo.get("Max2Id") == null) continue;
            answer.add((Integer)genreInfo.get("Max2Id"));
        }
        System.out.print(answer);
        System.out.print(genreInfoList);
        return answer;
    }
}