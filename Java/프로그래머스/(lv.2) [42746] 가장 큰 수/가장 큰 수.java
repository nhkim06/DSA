import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        String[] nums = new String[numbers.length];
        for (int i=0; i<numbers.length; i++){
            nums[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(nums, (a, b)-> (b+a).compareTo(a+b));
        
        if (nums[0].equals("0")) return "0";
        
        StringBuilder ans = new StringBuilder();
        for(int i=0; i<nums.length; i++){
            ans.append(nums[i]);
        }
        
        return ans.toString();
    }
}

/*
문제 해석
- 주어진 숫자들을 조합해 만들 수 있는 가장 큰 숫자 만들기

문제 해결
- numbers의 값들을 String로 변환해 조합들을 비교 정렬
    1. String으로 바꾸기 
    2. 정렬하기

*/