/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120923
 */

class Solution {
    public int[] solution(int num, int total) {
        int base = total/num;
        int baseIdx = num/2; 
        
        int first = base - baseIdx;
        if (num%2==0) first+= 1;
        
        int[] answer = new int[num];
        
        for (int i=0; i<num; i++){
            answer[i] = first;
            first ++; 
        }
        
        return answer;
    }
}

/* 
    문제 해결 과정 : 기준 숫자를 어케 알아낼 수 있을까. => num을 왜 줬는가 => 나눠보자. 
    - testcase1에서 12/3 => 4가 나옴. 4 포함, 앞뒤로 숫자 3개의 합 [3, 4, 5] => 만족
    - testcase2에서 15/5 => 3이 나옴. 앞뒤 숫자 포함 [1, 2, 3, 4, 5] => 만족
    - testcase4에서 5/5 => 1이 나옴. 앞뒤 숫자 [-1, 0, 1, 2, 3] => 만족
    BUT num이 짝수인 경우 
    - testcase3에서 14/4 => 3r2가 나옴. 3포함 앞 뒷 숫자 [2, 3, 4] 왼쪽을 포함할 지 오른쪽을 포함할지 여부 고려.


*/