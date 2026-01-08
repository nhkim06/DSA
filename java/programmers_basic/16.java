/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120903
 */
import java.util.HashSet;

class Solution {
    public int solution(String[] s1, String[] s2) {
        HashSet<String> hash = new HashSet<>();
        int count = 0; 
        
        for (String s : s1){
            hash.add(s);
        }
        for (String s : s2){
            if (hash.contains(s)) {
                count++;
            }
        }
        return count;
    }
}

/*
    문제 해결
        1. 가장 심플한 방법 : 각 배열의 요소을 일일이 비교 => O(nm) n은 s1의 길이, m은 s2의 길이
            더 좋은 방법이 있을까?
        2. HashSet 사용 => O(n)
*/