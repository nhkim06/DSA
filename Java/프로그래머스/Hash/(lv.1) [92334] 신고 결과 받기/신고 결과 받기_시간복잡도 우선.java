import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 1. 중복 신고 제거 (처음부터 유일한 신고만 남김)
        Set<String> uniqueReport = new HashSet<>(Arrays.asList(report));

        // 2. 피신고자별 신고자 목록 저장 (Target -> Reporters)
        Map<String, Set<String>> reportedMap = new HashMap<>();
        for (String r : uniqueReport) {
            String[] split = r.split(" ");
            String reporter = split[0];
            String target = split[1];
            
            // 피신고자를 키로 하여 신고자들을 셋에 담음
            reportedMap.computeIfAbsent(target, x -> new HashSet<>()).add(reporter);
        }

        // 3. 각 유저가 받을 메일 수 계산 (Reporter -> Count)
        Map<String, Integer> mailCounts = new HashMap<>();
        for (Set<String> reporters : reportedMap.values()) {
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCounts.put(reporter, mailCounts.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        // 4. id_list 순서에 맞춰 결과 배열 생성
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCounts.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}