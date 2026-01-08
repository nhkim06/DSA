/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120897
 */

import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=1; i*i<=n; i++){
            if( n % i == 0 ) {
                list.add(i);
                if (i*i != n) list.add(n/i);
            }
        }
        list.sort(null);

        int[] ans = new int[list.size()];
        for (int i=0; i<list.size(); i++){
            ans[i] = list.get(i);
        }
        
        return ans;
        
    }
}
/*
    문제 해결 과정
        1. n을 1~n까지의 숫자로 일일이 나눠 나머지가 0이면 리스트에 포함하기 => O(n) 
            더 좋은 방법?
        2. n을 1~루트n까지의 숫자로 나눠 나머지가 0이면 해당 숫자와, 짝이 되는 숫자 (n/i) 둘을 리스트에 포함하기 => O(루트n)
*/