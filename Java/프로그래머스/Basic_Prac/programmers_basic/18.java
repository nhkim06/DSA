/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120899
 */

class Solution {
    public int[] solution(int[] array) {
        int max = array[0];
        int idx = 0;
        for (int i=1; i<array.length; i++){
            if (array[i] > max) {
                max = array[i];
                idx = i;
            }
        }
        return new int[]{max, idx};
    }
}

/*
    문제 파악
        - unsorted array => logN 불가능.
        - output [큰 수, 인덱스]
    문제 해결
        - max와 인덱스 숫자 저장할 변수를 업데이트 하는 방식
*/