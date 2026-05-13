import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // reportedUsers(피신고자ID : 신고자set)
        // 제미나이 : 중복을 먼저 제거한 후 split하는게 효율 더 좋다
        Map<String, Set<String>> reportedUsers = new HashMap<>();
        for (String r : report) {
            String[] split = r.split(" ");
            reportedUsers.computeIfAbsent(split[1], x -> new HashSet<>()).add(split[0]);
        }

        // mailCounts에 (신고자 ID : 메일 개수)
        Map<String, Integer> mailCounts = new HashMap<>();
        for (Set<String> reporters : reportedUsers.values()) {
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCounts.put(reporter, mailCounts.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        // 배열에 담기
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCounts.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}