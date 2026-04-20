import java.util.Queue;
import java.util.LinkedList;
import java.util.Collections;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (int p: priorities){
            queue.offer(p);
        }
        
        int count = 0;        
        while (!queue.isEmpty()){
            int maxP = Collections.max(queue);
            int target = queue.poll();
            
            if(target < maxP){
                queue.offer(target);
                if ( location == 0 ) location = queue.size() - 1;
                else location--;
            }else {
                count++;
                if (location == 0) return count;
                else location--;
            }
        }
        
        return -1;
    }
}


/*
문제 해석
- in  : priorities(중요도가 담긴 배열), location(선택한 프로세스의 위치)
- out : location 프로세스가 몇번째로 실행되는지

문제 해결
1. 프로세스를 어떻게 구분할 것인가?
    - 매핑
    - 선택한 프로세스의 위치 바뀔 때 마다 location을 같이 업데이트 해주기 => 사용
2. 우선순위 더 높은 프로세스가 있는지 확인하는 방법?
    - queue 전체를 순회하기 => O(n) => 전체 O(n^2)
    - priority queue는 저장 공간을 2배로 사용하는 거라 비효율적. 


*/