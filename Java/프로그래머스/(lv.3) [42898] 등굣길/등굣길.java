class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n+1][m+1];

        // 웅덩이 : -1
        for (int[] puddle : puddles) {
            dp[puddle[1]][puddle[0]] = -1;
        }
        
        dp[1][1] = 1;

        int mod = 1_000_000_007;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // 시작 위치거나 물에 잠긴 지역이면 패스
                if ((i == 1 && j == 1) || dp[i][j] == -1) {
                    continue;
                }

                int fromTop = 0;
                int fromLeft = 0;

                // 위쪽 칸에서 올 수 있는 경우 (위쪽 칸이 존재하고, 웅덩이가 아닐 때)
                if (i-1 >= 1 && dp[i-1][j] != -1) {
                    fromTop = dp[i-1][j];

                }

                // 왼쪽 칸에서 올 수 있는 경우 (왼쪽 칸이 존재하고, 웅덩이가 아닐 때)
                if (j-1 >= 1 && dp[i][j-1] != -1) {
                    fromLeft = dp[i][j-1];
                }
                // 현재 칸의 최단 경로 수 = 위에서 오는 방법 + 왼쪽에서 오는 방법
                dp[i][j] = (fromTop + fromLeft) % mod;
            }
        }

        // 학교 위치(n, m)의 최단 경로 수 반환
        return dp[n][m];
    }

}