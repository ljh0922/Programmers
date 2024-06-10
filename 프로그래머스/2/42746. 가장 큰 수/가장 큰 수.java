import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 숫자를 문자열로 변환하여 리스트에 저장
        List<String> nums = new ArrayList<>();
        for (int n : numbers) {
            nums.add(String.valueOf(n));
        }

        // 커스텀 Comparator를 사용하여 정렬
        nums.sort((s1, s2) -> (s2 + s1).compareTo(s1 + s2));

        // 정렬된 문자열을 하나의 문자열로 합침
        StringBuilder answer = new StringBuilder();
        for (String num : nums) {
            answer.append(num);
        }

        // "0000..." 처럼 0이 여러 개 있는 경우를 처리
        if (answer.charAt(0) == '0') {
            return "0";
        }

        return answer.toString();
    }
}
