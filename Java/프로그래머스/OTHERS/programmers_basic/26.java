/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120891
*/
class Solution {
    public int solution(int order) {
        String orderStr = String.valueOf(order);
        int count = 0;

        for (int i=0; i<orderStr.length(); i++){
            char chr = orderStr.charAt(i);
            if ( chr =='3' ||  chr =='6' ||  chr =='9' ) {
                count++;
            }
        }
        
        return count;
    }
}

/*
    문제 해결 방법
        1. order을 String으로 변환 후 모든 인덱스를 돌며 3, 6, 9가 있는지 조회
            => 다른 방법은 없을까?
*/