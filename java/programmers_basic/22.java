/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120895
*/
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] my_char = my_string.toCharArray();
        char temp = my_char[num1];
        my_char[num1] = my_char[num2];
        my_char[num2] = temp;        
        return new String(my_char);
    }
}

/*
    문제 해결
    1. 슬라이싱 활용 - 비효율적
    2. char array로 변환하기
*/