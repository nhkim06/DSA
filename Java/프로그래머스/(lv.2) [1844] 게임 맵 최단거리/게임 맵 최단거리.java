import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;
        
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        Deque<int[]> queue = new ArrayDeque<>(); // 방문 가능한 곳 넣기
        queue.add(new int[]{0, 0});
        
        while (!queue.isEmpty()){
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            
            for (int i=0; i<4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                if(nx>=0 && ny>=0 && nx<n && ny<m && maps[nx][ny]==1){
                    if (nx == 0 && ny == 0) continue;
                    
                    maps[nx][ny] = maps[x][y]+1;
                    queue.add(new int[]{nx, ny});
                }                
            }
        }
        
        int answer = maps[n-1][m-1];  
        return answer == 1 ? -1 : answer;
    }
}

/*
문제해석
- 

문제 해결
- 


*/