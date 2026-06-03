import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int dd : d){
            pq.add(dd);
        }
        
        int answer = 0;

        while (budget > 0 && !pq.isEmpty()){
            int cur = pq.poll();
            budget -= cur;
            if(budget >= 0) answer++;
            
        }
        
        return answer;
    }
}