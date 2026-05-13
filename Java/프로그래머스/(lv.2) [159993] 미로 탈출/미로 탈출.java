import java.util.*;
class Solution {
    int n, m;
    char[][] grid;
    int[] dx = new int[]{-1, 1, 0, 0};
    int[] dy = new int[]{0, 0, -1, 1};
    
    public int solution(String[] maps) {
        this.n = maps.length;
        this.m = maps[0].length();
        this.grid = new char[n][m];
        
        // 1. S, E, L 좌표 찾기
        int[] S = new int[2];
        int[] E = new int[2];
        int[] L = new int[2];
        for(int i=0; i<n; i++){
            grid[i] = maps[i].toCharArray();
            for(int j=0; j<m ; j++){
                if ( grid[i][j]=='S' ) S = new int[]{i, j};
                else if ( grid[i][j]=='L' ) L = new int[]{i, j};
                else if ( grid[i][j]=='E' ) E = new int[]{i, j};
            }
        }
        
        // 2. X만 아니면 다음 칸 탐색하며 S->L 최단 거리 구하기
        int toLever = bfs(S, L);
        if (toLever == -1) return -1;
        
        
        // 3. L->E 최단 거리 구하기
        int toExit = bfs(L, E);
        if (toExit == -1) return -1;
        
        return toLever + toExit;
    }
    
    private int bfs(int[] start, int[] end){
        
        Deque<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[n][m];
        
        queue.add(new int[]{start[0], start[1], 0});
        
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];
            int dist = cur[2];

            if (x == end[0] && y == end[1]){
                return dist;
            }

            for (int k=0; k<4; k++){
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx>=0 && ny>=0 && nx<n && ny<m && grid[nx][ny]!='X' && !visited[nx][ny]){

                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny, dist+1});
                }
            }
        }
        
        return -1;
        
    }
}


/*
문제 해석
- 출발 -> 레버 -> 출구
- 레버 안 당기면 출구도 통로
- 최대한 빠르게 미로를 빠져나가는데 걸리는 시간은?
- 탈출할 수 없다면 -1
- 모든 길 여러 번 지나갈 수 있음

문제해결
1. S, E, L 좌표 찾기
2. X만 아니면 다음 칸 탐색하며 S->L 최단 거리 구하기
3. L->E 최단 거리 구하기


*/