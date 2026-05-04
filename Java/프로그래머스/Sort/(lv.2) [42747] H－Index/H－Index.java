import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);     // 	[0, 1, 3, 5, 6]
        int n = citations.length;
        for(int i=0; i<n; i++){
            // i번째를 기준으로 잡았을 때
            int h = n - i;  // h번 이상 인용된 논문 개수. 3
            if(citations[i]>=h) return h;       
            
        }
            
        return 0;
    }
}


/*
문제 해석
- 논문 n편 중, h번 이상 인용된 논문이 h편 이상이고
- 나머지 논문이 h번 이하 인용되었다면 h의 최댓값이 이 과학자의 H-Index 구하기

문제 해결
1. 그림으로 상상.  
    0----
    -0---
    --0--
    위 셋은 조건 만족 (h번 이상 인용된 논문이 h편 이상, 나머지 논문이 h번 이하)
    ---0- 이거 부터는 불만족. 
    => --0-- 이게 최대 값. 
    
    1) loop 돌면서 인덱스를 0부터 증가 시키기. 
    2) 조건을 만족하지 못하는 값을 만나면 그 전 값 리턴
        - 근데 이걸 그냥 하면 O(n^2)가 됨 
        - 그럼 정렬을 한 다음, 중간값 찾아서 증가시키기
    
    

*/