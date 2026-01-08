/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120905
 */
class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        
        for (int i=0; i<num.length(); i++) {
            sum += num.charAt(i) - '0';
        }
        return sum;
    }
}

/*
    문제 해결
        1. String으로 바꿔서 각 자리 수를 가져오기.
            - 각 자리수를 다시 int로 바꿔 sum에 더하기
            - Integer.parseInt(String.valueOf(num.charAt(i))) 불필요한 형 변환이 있음
        2. char의 특성 활용하기
            - num.charAt(i) - '0’
*/