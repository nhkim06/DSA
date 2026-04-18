import java.util.HashMap;
import java.util.ArrayList;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, ArrayList<String>> clothesMap = new HashMap<>();
        
        for (String[] c : clothes){
            clothesMap.putIfAbsent(c[1], new ArrayList<String>());
            clothesMap.get(c[1]).add(c[0]);                        
            
        }
        // {eyewear=[blue_sunglasses], headgear=[yellow_hat, green_turban]}
        
        // { face=[1, 2, 3] }
        // 2^0*V
        
        int answer = 1;
        for (ArrayList<String> sameType : clothesMap.values()){
            answer *= sameType.size() + 1;
        }
        
        return answer-1;
    }
}


/*
문제 해석
- in  : [옷 이름, 종류] 가 매핑 된 배열
- out : 서로 다른 옷 조합 수 
- 조건 : 
    - 각 종류별로 최대 1개씩 착용
    - 전부만 아니면 일부는 겹쳐도 됨
    - 최소 1개 이상의 의상 조합

문제 해결
1. 일일이 비교 => 비효율
2. 각 값들을 hashmap에 담기 : O(n^2) => O(n)
    1) 키는 의상 종류로 해서 array로 담기
    2) 각 키 값을 하나씩 탐색하며 조합 => 수학 공식 사용. 
        - 식 : (각 키에 대해 v(선택할 수 있는 옷 종류) + 1(없는 경우)를 모두 곱한 것) -1(아무것도 안 입은 경우)
3. 2차원 배열 형태로 탐색? => 저장 공간 낭비가 생길 수 있음
4. hashset에 가능한 조합들 다 만들어 넣은 다음, 선별 => 불필요한 과정이 너무 많음
=> 2번


*/