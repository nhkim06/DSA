/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120913
 */
class Solution {
    public String[] solution(String my_str, int n) {
        int len = my_str.length();
        int arrIdx = (len + n - 1) / n;
        String[] answer = new String[arrIdx];
        
        for (int i=0; i<arrIdx; i++){
            int start = i*n;
            int end = Math.min( start+n , len );
            answer[i] = my_str.substring(start, end);
        }
        
        return answer;
        
    }
/*
    문제 해결 : 
        - my_str/n으로 answer의 element 개수 구하기
        - 각각의 index에 substring으로 n만큼 잘라 넣기
        - my_str/n의 나머지 에 해당하는 값들은 sunstring(n)으로 처리
*/