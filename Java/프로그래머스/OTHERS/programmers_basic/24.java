/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120893
*/
class Solution {
    public String solution(String my_string) {
        char[] array = my_string.toCharArray();
        for (int i=0; i<my_string.length(); i++){
            if (Character.isUpperCase(array[i])){
                array[i] = Character.toLowerCase(array[i]);
            }else{
                array[i] = Character.toUpperCase(array[i]);
            }
        }
        return new String(array);
    }
}

/*
    문제 해결
    - 대소문자인지 구분 후 소문자이면 소문자, 대문자이면 대문자로 변환
*/