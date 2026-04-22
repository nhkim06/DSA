import java.util.HashMap;
import java.util.Map;

    
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> score = new HashMap<>();
        for (int i=0; i<name.length ; i++){
            score.put(name[i], yearning[i]);
        }
        
        int n = photo.length;
        int[] answer = new int[n];

        for (int i=0; i<n; i++){
            for (String p : photo[i]){
                Integer s = score.get(p);
                if (s != null) answer[i] += s;                    
            }
        }
                
        return answer;
    }
}


/*
문제 해석
- input : name, yearning, photo
- output : photo[n] 안에 있는 사람의 yearning 합산

문제 풀이
1. 기본 : 
    1) photo를 돌면서 각 photo에 name과 일치하는 인덱스 찾기
    2) 해당 인덱스의 yearning 값 합산하여 result 배열에 저장
     => name개수가 n, 
        photo 요소 개수 m, 
        photo 요소 내부 개수를 k라고 할 때, 
        시간복잡도 O(nmk)으로 너무 오래 걸림
2. hashmap
    - 특징 : O(1)에 저장, 접근 가능
    1) hashmap에 {may:5} 이런 식으로 매핑해서 저장. 
    2) photo의 각 요소가 hashmap에 있는지 탐색
    3) 있을 경우 매핑 된 값을 합산
     => O(n + mk)
3. set
    - 특징 : 중복 제거, 순서X
     => 여기선 쓸 필요 없음
*/