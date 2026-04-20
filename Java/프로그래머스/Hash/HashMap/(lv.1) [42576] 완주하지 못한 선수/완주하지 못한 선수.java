import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> participantMap = new HashMap<>();
        
        for (String c : completion){
            participantMap.put(c, participantMap.getOrDefault(c, 0)+1);

        }
                
        for (String p : participant){
            if (!participantMap.containsKey(p)) return p; // 맵에 없음
            else if (participantMap.get(p) < 1 ) return p;
            
            participantMap.put(p, participantMap.get(p)-1);
        }

        
        return "";
    }
}

/*
문제 해석
- in  : participant, completion
- out : 완주 못한 단 한 명의 선수 이름

문제 풀이
1. participant, completion을 sort 한 후 비교
    => 비교 기반 sort는 최소 O(nlogn). 비효율
2. hashset에 completion 넣고 participant의 요소를 키 삼아 값 저장여부 확인
    => O(n)으로 더 효율적. 
    => 중복도 확인해야 함
3. hashMap에 completion 넣고 participant의 요소를 키 삼아 값 저장여부 확인. 
    value로 등록된 이름 개수

*/