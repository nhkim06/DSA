/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120911
 */
import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String lowerCased = my_string.toLowerCase();
        char[] arr = lowerCased.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
        
    }
}

