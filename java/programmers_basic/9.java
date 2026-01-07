/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120910
 */

class Solution {
    public int solution(int n, int t) {
        return (int)Math.pow(2, t) * n;
    }
}

/*
    문제 해결 과정 : 
        수식 : 2^t * n
        검증
            - 2^10 * 2 = 2048
            - 2^15 * 7 = 229,376
*/