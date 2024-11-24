import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
         Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();

        // 배열을 Set으로 변환
        for (int l : lost) lostSet.add(l);
        for (int r : reserve) reserveSet.add(r);

        // 여벌 체육복이 있는 학생이 도난당했을 경우 우선 제거
        Iterator<Integer> it = lostSet.iterator();
        while (it.hasNext()) {
            int l = it.next();
            if (reserveSet.contains(l)) {
                reserveSet.remove(l); // 여벌 제거
                it.remove();          // 도난 제거
            }
        }

        // 체육복 빌려주기
        for (int r : reserveSet) {
            if (lostSet.contains(r - 1)) {
                lostSet.remove(r - 1);
            } else if (lostSet.contains(r + 1)) {
                lostSet.remove(r + 1);
            }
        }

        // 체육수업을 들을 수 있는 학생 수 계산
        return n - lostSet.size();
    }
}
