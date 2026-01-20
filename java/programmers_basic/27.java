/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120890
*/
class Solution {
    public int solution(int[] array, int n) {
        int ans = array[0];
        for (int i=1; i<array.length; i++){
            int difAns = Math.abs(n-ans);
            int difCur = Math.abs(n-array[i]);
            
            if( difCur < difAns ) ans = array[i];
            else if ( difCur == difAns && array[i] < ans ) ans = array[i];
        }
        
        return ans;
    }
}