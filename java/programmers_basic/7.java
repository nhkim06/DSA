/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120912
 */
class Solution {
    public int solution(int[] array) {
        int count = 0;
        for (int arr : array){
            String arrStr = String.valueOf(arr);
            for (int i=0; i<arrStr.length(); i++){
                if(arrStr.charAt(i) == '7') count ++;
            }
        }
        return count;
    }
}

/*
    문제 풀이 과정: 
    - 7의 개수를 어떻게 셀 것인가?
        1. 1의 자리수, 10의 자리수.. int를 분해해 7을 count => 코드가 길어지고 복잡
        2. String으로 바꿔 7의 개수 count
            1) count()? => java에는 count()함수 없음
            2) indexOf() 사용. => 코드 복잡해짐. indexOf() 수행하면 어짜피 앞에서부터 한 글자씩 비교. 
                => 차라리 원시적인 것 같아도 덜 복잡한 방법으로.
            3) String의 첫 번째~마지막 인덱스 일일이 7인지 조사
    
*/