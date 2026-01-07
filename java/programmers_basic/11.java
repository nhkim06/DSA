/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120908
 */
class Solution {
    public int solution(String str1, String str2) {
        return str1.indexOf(str2) == -1 ? 2 : 1;
        // 또는 contains() 사용
        // return str1.contains(str2) ? 1 : 2;
    }
}

/*
    문제 해결 과정
        - 문자열 메서드 사용하면 쉽게 해결 가능할 것으로 예상. 요구사항 보면 이로도 충분.
        - 하지만 자료구조 수업 때 배웠던 알고리즘 구현해보고 싶음
            - KMP
            - Boyer–Moore
*/