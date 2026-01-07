class Solution {
    public int solution(String A, String B) {
//         if (A.equals(B)) return 0;
//         int tarIdx = A.lastIndexOf(B.charAt(0));
        
//         while( tarIdx != -1 ){
//             int shift = A.length() - tarIdx;
//             String shifted = A.substring(tarIdx) + A.substring(0, tarIdx);
            
//             if (shifted.equals(B)) return shift;
            
//             tarIdx = A.lastIndexOf(B.charAt(0), tarIdx-1);
//         }
        
//         return -1;
        
        
//         if (A.equals(B)) return 0;
        
//         for (int i=1; i<A.length(); i++){
//             int lastIdx = A.length();
//             String shifted = A.substring(lastIdx-i) + A.substring( 0, lastIdx-i );
//             if (shifted.equals(B)) return i;
//         }
//         return -1;
        
        if (A.equals(B)) return 0;
        String AA = A+A;
        int idx = AA.lastIndexOf(B);
        if (idx==-1) return -1;
        return A.length() - idx;
    }
}

/*       
    문제 해결 방법 : 
    1. 한 글자 씩 밀어서 일일이 비교 => O(n^2) => 더 단축? 
    2. B의 첫 글자의 인덱스를 A에서 찾고, 해당 인덱스에서 shift해 비교 => 이 또한 O(n^2)
        - 우려 사항 : B의 첫 글자에 해당되는 글자가 A 안에 여러 개라면? ⇒ 반복문으로 처리
    둘 다 코드 짜서 비교해보자
    ⇒ 같은 시간 복잡도인데, 1번의 코드가 더 직관적이고 간단함. 둘이 비교했을 때는 1번이 나음4

    이게 최선일까? 
        왜 O(n^2)이 걸리는가? 
        - for문으로 일일이 shift해가며 비교 O(n)   +   substring() 이 걸리는 시간 O(n)
        ⇒ O(n)으로 가능한 방법 모색. A+A로 A를 늘린 String에서 B 찾기
*/