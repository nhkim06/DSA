/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120894
*/
class Solution {
    public long solution(String numbers) {
        String[] nums = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};        
        for (int i=0; i<10; i++){
            numbers = numbers.replace(nums[i], String.valueOf(i));
        }
        
        return Long.parseLong(numbers);
    }
}