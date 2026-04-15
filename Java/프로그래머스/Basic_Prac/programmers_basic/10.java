/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120909
 */


class Solution {
    public int solution(int n) {
        int squared = (int)Math.sqrt(n);
        return squared*squared == n ? 1 : 2;
    }
}

/*
    문제 해결 : 
        가설 : 
            - n의 제곱근은 정수일 것이다
            => n을 루트하여 정수값만 취하고, 다시 제곱한 값이 n과 같다면 제곱수가 맞다.
    발전 시키기 : 
        Math.pow()를 사용했으나, 더 좋은 방법 : squared*squared 이런 식으로 직접 곱하기
        
*/