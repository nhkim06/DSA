import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int[] nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (int n : nums){
            numsSet.add(n);
        }
        return Math.min(numsSet.size(), nums.length/2);
        
    }
}

/*
문제해석
- in  : 보유 포켓몬 종 id 배열
- out : n/2마리 가져갈 때 최대 폰캣몬 가지 수

문제풀이
1. hashmap에 포켓몬 id를 키, 개수를 값으로 저장하여 활용하기? => 비효율
2. hashset 사용
    1) nums의 요소를 hashset에 저장
    2) hashset의 개수와 n/2 중 min값 출력

*/