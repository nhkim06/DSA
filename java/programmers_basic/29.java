/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120888
*/

class Solution {
    public String solution(String my_string) {
        StringBuilder ans = new StringBuilder();
        
        for ( int i=0; i<my_string.length(); i++ ){
            char c = my_string.charAt(i);
            if ( ans.indexOf(String.valueOf(c)) == -1 ){
                ans.append(my_string.charAt(i));
            }
        }
        
        return ans.toString();
    }
}

/*
    문제해결
        1. 첫 번째 인덱스부터 last indexOf()를 사용해 해당 인덱스의 글자 제거 
            => 중첩 반복문 때문에 최악의 경우 O(n^2)이 될 수 있음
        2. StringBuilder에 중복이 아닌 것만 추가하기 => O(n)
*/