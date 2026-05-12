import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashmap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            int n = target - nums[i];
            if (hashmap.containsKey(n)){
                return new int[]{hashmap.get(n), i};
            }

            hashmap.put(nums[i], i);
        }
        return new int[2];
    }
}

/*
문제 해석
- indices of two nums that add up to target


문제 해결
- 완전탐색 : target-cur 값이 배열에 있는지 확인하기
- hash 사용하기
    1. hashmap에 각 값 넣기 O(n) (key=nums요소값, value=index)
    2. nums의 값을 순차적으로 탐색. hashmap에 target-cur가 있는지 확인
    3. index반환


 */