/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120887
*/
class Solution {
    public int solution(int i, int j, int k) {
        StringBuilder nums = new StringBuilder();
        for (int idx = i; idx<=j; idx++){
            nums.append(idx);
        }
        
        int count = 0;
        for (int idx=0; idx<nums.length(); idx++){
            if ( nums.charAt(idx) == (char) ('0' + k ) ) count++;
        }

        return count;
    }
}

/*
    문제 해결
        1. i~j까지의 숫자 하나씩 String으로 바꿔 count하기
        2. i~j까지의 숫자를 하나의 String으로 만들어 count하기
*/