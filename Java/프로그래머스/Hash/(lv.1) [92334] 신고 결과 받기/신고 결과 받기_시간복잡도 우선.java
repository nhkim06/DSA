import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 1. noDupReports set으로 중복 처리하기
        Set<String> noDupReports = new HashSet<>(Arrays.asList(report));
        
        // 2. noDupReports 순회하며 reporteeMap에 (피신고 유저ID : 신고자set) 저장
        Map<String, Set<String>> reporteeMap = new HashMap<>();
        for (String rep : noDupReports){
            String[] r = rep.split(" ");
            String reporter = r[0];
            String reportee = r[1];

            reporteeMap.computeIfAbsent(reportee, x -> new HashSet<>()).add(reporter);
        }
        
        // 3. reporteeMap 순회하며 size가 k 이상인 경우, reporterMap(신고자ID : 개수) 에 메일 수 저장
        Map<String, Integer> reporterMap = new HashMap<>();
        
        for (Set<String> reporters : reporteeMap.values()) {
            if (reporters.size() >= k){
                for (String reporter : reporters){
                    reporterMap.put(reporter, reporterMap.getOrDefault(reporter, 0)+1);
                }
            }
        }
        
        // 4. 배열에 담기
        int[] answer = new int[id_list.length];
        for (int i=0; i<id_list.length; i++){
            answer[i] = reporterMap.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}

/*
문제 해석
1. 유저를 신고함. 동일 유저는 1회로 처리, k번 누적 시 정지
2. 정지당한 유저를 신고한 유저에게 신고 처리 결과 메일 발송


문제 해결
- hashmap과 hashset 사용하기
    1. hashset으로 중복 처리하기
    2. hashmapWarns과 (피신고 유저ID : 신고자set) 저장
        - splice로 신고자, 피신고자 분리. 신고자set에 저장하기
    3. hashmapWarns 순회하며 size가 k 이상인 경우, hashmapReporter 에 메일 수 저장
    4. 배열로 저장

*/