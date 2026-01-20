/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120892
*/
class Solution {
    public String solution(String cipher, int code) {
        StringBuilder answer = new StringBuilder();
        int idx = code-1;
        
        while( idx < cipher.length() ){
            answer.append(cipher.charAt(idx));
            idx += code;
        }
        
        return answer.toString();
    }
}

/*
    문제 해결
        1. cipher의 모든 인덱스를 돌며 code로 나눠 떨어지는 경우에만 answer에 추가 -> 시간 복잡도 측면 비효율적
        2. char array로 바꿔 code의 배수 인덱스의 char을 answer에 추가 -> 메모리 비효율적 사용
        3. str.charAt(i) 사용해서 code의 배수만 돌기
            => String은 불변 객체여서 +=을 할 때마다 새 객체가 생성됨 -> 비효율적
        4. StringBuilder 사용하기
*/