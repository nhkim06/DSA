import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportedUsers = new HashMap<>();
        for (String r : report) {
            String[] split = r.split(" ");
            reportedUsers.computeIfAbsent(split[1], x -> new HashSet<>()).add(split[0]);
        }

        Map<String, Integer> mailCounts = new HashMap<>();
        for (Set<String> reporters : reportedUsers.values()) {
            if (reporters.size() >= k) {
                for (String reporter : reporters) {
                    mailCounts.put(reporter, mailCounts.getOrDefault(reporter, 0) + 1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            answer[i] = mailCounts.getOrDefault(id_list[i], 0);
        }

        return answer;
    }
}