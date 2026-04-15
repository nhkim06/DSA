/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120922
 */
class Solution {
    public int solution(int M, int N) {
        return N * (M-1) + N-1;
    }
}

/*
    output : M x N 크기의 종이를 최소로 가위질 해야하는 횟수를 return
    
    문제 해결 과정
        1. N 또는 M이 1인 경우 : 나머지 값 그대로 반환
            만약 N = 1, M-1값 반환
            만약 M = 1, N-1값 반환
        2. N 또는 M이 2인 경우 : 예를 들어 2xM인 경우 한 번 잘라 1xM으로 바꾸기
            가설 : 2*(n-1) + 1 
            2x3 => 5  | 2*2+1
            2x4 => 7  | 2*3+1
            2x5 => 9  | 2*4+1
            ===> 만족
        3. N 또는 M이 3인 경우 : 예를 들어 3xM인 경우 두 번 잘라 1xM으로 바꾸기
            가설 : 3*(n-1) + 2
            3x2 => 5  | 3*1 + 2
            3x4 => 11 | 3*3+2
            ===> 만족
        수식 : N * (M-1) + N-1
        
*/