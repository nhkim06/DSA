class Solution {
    int answer = 0;
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];

        // computers : 인접 행렬
        for (int i=0; i<n; i++){
            if (!visited[i]) {
                dfs(computers, visited, i);
                answer++;
            }
        }

        return answer;
    }
    
    void dfs(int[][] computers, boolean[] visited, int cur){
        visited[cur] = true;
        for (int i=0; i<computers.length; i++){
            if (i != cur && !visited[i] && computers[cur][i] != 0){
                dfs(computers, visited, i);
            }
        }
        
        // 이러면 하나의 네트워크 탐색 완료. 
        // 만약 탐색 못한게 있으면 탐색 못한 인덱스를 cur로 호출
        return ;
    }
}


/*
문제 해석
- 네트워크의 개수를 return
- 연결된 거 개수
    
*/