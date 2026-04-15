/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120924
*/
class Solution {
    public int solution(int[] common) { 
        if (common[1]*common[1]==common[0]*common[2]){
            if (common[0] != 0) return common[common.length-1] * common[1]/common[0];
        }
        // else if (common[1]-common[0] == common[2]-common[1]){
        // } 
        return common[common.length-1] + common[1]-common[0];
    }
}