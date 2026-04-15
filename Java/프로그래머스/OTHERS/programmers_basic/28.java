/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120889
*/
class Solution {
    public int solution(int[] sides) {
        int max = Math.max( sides[0], Math.max(sides[1], sides[2]));
        int sum = sides[0] + sides[1] + sides[2];

        return max < sum-max? 1 : 2 ;
    }
}

/*
    문제 분해
        1. 가장 긴 변과 나머지 두 변 찾기
        2. '두 변의 길이 합 < 가장 긴 변 길이' 비교 
            => 1 또는 2 반환
            
    문제 해결
        1. 3가지 경우 모두 비교하기. (어떤 변이 긴 변이든 변 A의 길이는 나머지 두 변의 합보다 작아야 함)
            => 코드는 간단하겠지만 비효율적
        2. sort 사용해서 array를 정렬한 후 비교하기 => 추가 메모리를 사용해야 함
        3. 가장 긴 변의 길이 찾고, '세 변의 총합 - 가장 긴 변의 길이'를 사용해 비교
*/