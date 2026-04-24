import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] nums = s.replaceAll("[{}]", "").split(",");
        Map<Integer, Integer> freq = new HashMap<>();
        int[] answer = new int[s.length()];
        
        // 각 숫자의 frequency HashMap에 계산
        for (String ns : nums){
            int n = Integer.parseInt(ns);
            freq.put( n , freq.getOrDefault(n, 0) + 1 );
        }
        
        // 빈도수 대로 정렬
        List<Integer> keySet = new ArrayList<>(freq.keySet());
        keySet.sort((a, b)-> freq.get(b) - freq.get(a));
        
        return keySet.stream().mapToInt(i->i).toArray();
    }
}

/*
문제 해석
- s : 특정 튜플을 표현하는 집합이 담긴 문자열
- result : s가 표현하는 튜플

튜플 특징
- 중복 O
- 순서 O
- 개수 유한

문제 해결
    문제 1 : return 할 튜플에 중복이 가능한가? => X 
    문제 2 : 튜플의 모든 구성 요소를 어떻게 알아낼 것인가?
        => 모든 집합 원소의 합집합 구하기
    문제 3 : 집합은 원소 순서가 뒤죽박죽인데, 어떻게 순서를 알아낼 것인가
        => 집합이 길이가 짧은거부터 시작해서 추가로 들어온 원소를 뒤에 배치하기
    
1. 문자열을 비교하기
    1. 배열의 길이 = s의 집합 개수
    2. s를 자료 구조에 담기 => s의 앞뒤 괄호 2개 자르고, split("},{")
    3. 길이 짧은 순서대로 정렬
    4. 하나씩 비교해가며 넘어가기 
2. hashmap 사용
    1. 배열의 길이 = s의 집합 개수
    2. s를 자료 구조에 담기 => replaceAll로 괄호들 지우고 split(",")
    3. hashmap에 빈도수 표시
    4. 빈도수 높은 순서대로 정렬해서 배열로 리턴

*/