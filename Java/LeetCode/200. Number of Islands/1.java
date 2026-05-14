class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[] dx = new int[]{-1, 1, 0, 0};
        int[] dy = new int[]{0, 0, -1, 1};

        Queue<Integer> queue = new ArrayDeque<>();
        int count = 0;

        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (grid[i][j] == '1'){
                    grid[i][j] = '0';
                    queue.offer(i*n+j);

                    while(!queue.isEmpty()){
                        int cur = queue.poll();
                        int x = cur/n;
                        int y = cur%n;
                        
                        for (int d=0; d<4; d++){
                            int nx = x + dx[d];
                            int ny = y + dy[d];

                            if ( nx>=0 && ny>=0 && nx<m && ny<n && grid[nx][ny] == '1' ){
                                grid[nx][ny] = '0';
                                queue.offer(nx * n + ny);
                            }

                        }
                    }
                    count ++;

                }
            }
        }

        return count;
    }
}



/*

문제 해석
- 섬 개수를 찾으시오. 
- 땅은 1로 표현
- 땅 영역의 상하좌우가 0일 때 하나의 섬

문제 해결
1. 좌표 문제는 dx, dy 만들어놓고 시작
2. 어짜피 전체 탐색해야 되면 bfs => Queue
3. 탐색은 문제 없는데, 섬인지를 어케 구분할 것인가
    - if문. 평범하게 grid 경계 검사, grid[nx][ny] == 1인지 검사
    - 마지막에 queue에 남아있는 요소의 개수 = 섬 개수

중첩 for문을 돌다가
=> 1인 경우를 찾으면 queue에 넣기. visited에 체크하기
=> 더 이상 갈 곳이 없으면 이어서 for문 돌기. visited 하지 않은 곳만
=> visited 필요 없이 1을 0으로 바꾸면 되잖아

하지만 알고 보니 dfs 로 풀어야 함
 */