import java.util.*;
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        if ( grid[0][0] == 1 || grid[n-1][n-1] == 1 ) return -1;
        if (n == 1) return 1;

        // boolean[][] visited = new boolean[n][n];  // => visited말고 grid에 표시
        int[] dx = new int[]{-1, 1, 0, 0, -1, 1, 1, -1};
        int[] dy = new int[]{0, 0, -1, 1, -1, 1, -1, 1};

        Queue<Integer> queue = new ArrayDeque<>(); // 다음 좌표 담기
        queue.add(0); // x, y, 거리
        grid[0][0] = 1;
        int dist = 1;

        while (!queue.isEmpty()){
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                int x = cur / n;
                int y = cur % n;

                if( x == n-1 && y == n-1 ) return dist;

                for (int j=0; j<8;j++){
                    int nx = x + dx[j];
                    int ny = y + dy[j];

                    if (nx>=0 && ny>=0 && nx<n && ny<n && grid[nx][ny]!=1){
                        grid[nx][ny] = 1;
                        queue.add( nx * n + ny );
                    }
                }
            }
            dist ++;
        }

        return -1;
    }
}


/*
문제 해석
- nxn 그리드가 주어졌을 때  top-left cell-> bottom-right cell 가는 가장 짧은 길 찾기(n - 1, n - 1)
- 길이 없으면 -1


문제 해결
- 대각선은 어떻게 탐색? dx, dy를 늘리자
- 빠른 길 찾기 = 가장  짧은 길 알아내려면 다 돌아야 함 -> bfs

 */