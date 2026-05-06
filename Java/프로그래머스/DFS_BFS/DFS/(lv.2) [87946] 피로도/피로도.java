class Solution {
    int max = 0;
    int[][] dungeons;
    boolean[] visited;
    
    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        this.visited = new boolean[dungeons.length];
        dfs(k, 0);
        return max;
    }
    
     public void dfs(int k, int dunCount){   // 현재 남은 피로도, 인덱스 , 현재 던전 개수
         if (dunCount > max) max = dunCount; 
         if (k <= 0) return;

         for (int i=0; i<dungeons.length; i++){ // 어디서 시작할지 몰라서 for문
            if ( !visited[i] && dungeons[i][0] <= k ){  // 이 던전 탐방 가능하면 : dunCount+1, 다음 브랜치 호출
                visited[i] = true;
                dfs(k - dungeons[i][1], dunCount+1);
                
                visited[i] = false;
            }
         }
     }
}


/*
문제 해석
- 최소 필요 피로도
- 소모 필요도(진짜)

문제 해결
1. 정렬 
2. dfs
    - 던전 하나씩 돌아서 
    - 중복 제거 : 
        - str/array 사용해서 탐색한 던전 트래킹
        - visited boolean array 처리?
        => 더 효율적인거 없나? 
        - for loop을 애초에 제어할 순 없나



*/