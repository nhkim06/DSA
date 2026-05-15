import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        Map<String, Set<String>> hashmap = new HashMap<>();
        
        for (int i=0; i<id_list.length; i++){ 
            hashmap.put(id_list[i], new HashSet<>());
        }
        
        for (int i=0; i<report.length; i++){
            String[] cur = report[i].split(" ");
            String reporter = cur[0];
            String target = cur[1];
            
            hashmap.get(target).add(reporter);
        }
        
        Map<String, Integer> hashmap2 = new HashMap<>();
        for (String tar : id_list){
            if (hashmap.get(tar).size() >= k) {
                for(String rep : hashmap.get(tar)){
                    hashmap2.put(rep, hashmap2.getOrDefault(rep, 0)+1);
                }
            }
        }

        int[] answer = new int[id_list.length];
        for (int i=0; i<id_list.length; i++){
            answer[i] = hashmap2.getOrDefault(id_list[i], 0);
        }
        
        return answer;
    }
}

/*
문제 해결
- 일단 (피신고자 : 신고자들) 저장 후
- map돌며 신고자들 수 > k 인 경우에만 (신고자 : count)에 개수 추가
- 배열로 변환 및 반환

*/


