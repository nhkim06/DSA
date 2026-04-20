import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> reportedUsers = new HashMap<>();
        
        for (String r: report){
            String[] user= r.split(" ");
            
            if(!reportedUsers.containsKey(user[1])) reportedUsers.put(user[1], new HashSet<>());
            reportedUsers.get(user[1]).add(user[0]);
        }
        
        Map<String, Integer> result = new HashMap<>();
        
        for(String reported : reportedUsers.keySet()){
            if(reportedUsers.get(reported).size() >= k){
                for (String reporter : reportedUsers.get(reported)){
                    result.put(reporter, result.getOrDefault(reporter, 0) + 1);
                }
            }
        }
        
        
        int[] answer = new int[id_list.length];

        for(int i=0; i<id_list.length; i++){
            answer[i] = result.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}


/*
문제 해석
- in  : 유저 ID 배열, 신고 당한 ID, 정지 기준 k
- out : 해당 유저가 신고한 유저 중 정지된 ID 개수
조건
    1) 동일 유저가 한 신고는 여러번 있어도 1회로 처리
    2) k번 이상 신고된 유저는 정지

문제 해결
1. hashset으로 중복 제거 후, hashmap에 넣기
    1) report hashset에 넣어서 중복 제거
    2) hashmap에 넣어서 각자 신고 당한 개수 count (신고당함 : [신고자들])
    3) k번을 넘은 ID 선별 => 배열?
    3) hashmap을 순회하며, 결과 배열 제작
2. hashmap 안에 hashset 넣기
    1) report마다 split해서 r[0] 신고자, r[1] 피신고자 사용
    2) hashmap에서 r[1]를 키로 저장할 hashset 선택
    3) hashset에 r[0] 저장
    4) 신고한 유저 Hashmap 만들어서 저장

*/