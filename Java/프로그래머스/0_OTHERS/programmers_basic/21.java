/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120896
 */

class Solution {
    public String solution(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (freq[i] == 1) {
                sb.append((char)(i + 'a'));
            }
        }

        return sb.toString();
    }
}

/*
    문제 해결
    1. input String의 각 글자를 HashSet에 하나씩 넣다가, HashSet 안에 해당 값이 이미 들어있는 경우 해당 값을 지우자
        => 그 후에 sort를 해야 되는데 HashSet에는 sort 메서드가 없음. 
           sort 알고리즘을 일일이 작성하기 보다 더 간편한 방법을 고민해보자
    2. input String 각 글자를 분해해서 Arrays에 저장한 후, sort를 하면 중복되는 글자는 연속적으로 배치되게 되어있음
        => 일단 정렬 먼저 한 다음, 앞뒤 element가 같은지 비교하고, 만약 같으면 해당 element를 지우는 방식.
    3. 더 좋은 방법 없나? 
*/