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
