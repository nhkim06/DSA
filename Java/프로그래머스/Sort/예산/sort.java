import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int sum = 0;
        Arrays.sort(d);
        System.out.println(Arrays.toString(d));
        for (int i=0; i<d.length; i++){
            sum += d[i];
            if(sum > budget) return i;
        }
        
        return d.length;
    }
}


/*
문제 해석
- 각 부서가 신청한 금액만큼을 모두 지원 (그 이상 가능)


문제 해결
1. sort해서 작은 숫자부터 더하기 -> 못 더하면 리턴
2. 

*/