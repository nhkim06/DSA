import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int c=0; c<commands.length; c++){
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];
            
            int[] candidate = new int[j-i+1];
            for (int idx=i-1; idx<j; idx++){
                candidate[idx-i+1] = array[idx];
            }
            System.out.println(Arrays.toString(candidate));

            
            Arrays.sort(candidate);
            
            answer[c] = candidate[k-1];

        }
        
        return answer;
    }
}

/*
문제 풀이 3번째 : 
- sort와 pq 사이에 시간복잡도 큰 차이 없음. 오히려 pq가 너 오래 걸릴 수 있음
- Arrays.sort로 정렬하기.

*/