import java.util.PriorityQueue;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int answer = 0;

        for(int s : scoville){
            minHeap.offer(s);
        }
        
        while(minHeap.size()>=2 && minHeap.peek() < K){
            int x = minHeap.poll();
            int y = minHeap.poll();
            minHeap.offer(x + y*2);
            answer++;
        }
        
        if (minHeap.size()==1 && minHeap.peek() < K) return -1;
        
        return answer;
    }
}