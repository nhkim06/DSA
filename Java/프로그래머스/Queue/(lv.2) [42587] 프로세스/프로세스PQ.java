import java.util.*;

class Solution {   
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // [1, 1, 9, 1, 1, 1]   i=0   l=0    a=5
        for (int p : priorities) {
            pq.offer(p);
        }

        int answer = 0;
        while (!pq.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                if (priorities[i] == pq.peek()) {   // 지금 인덱스 값이 가장 큰 값이면
                    pq.poll();
                    answer++;

                    if (i == location) return answer;
                }
            }
        }
        return answer;
    }
}