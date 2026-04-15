import java.util.Arrays;
    
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clothes = new int[n+1];
        Arrays.fill(clothes, 1);
        for (int l : lost) clothes[l]--;
        for (int r : reserve) clothes[r]++;
        
        for (int i=1; i<n+1; i++){
            if(clothes[i] < 1){
                // 왼쪽 검사
                if((i-1 > 0) && (clothes[i-1] > 1)){
                    clothes[i]++;
                    clothes[i-1]--;
                }
                // 오른쪽 검사
                else if((i+1 <= n) && (clothes[i+1] > 1)){
                    clothes[i]++;
                    clothes[i+1]--;
                }
            }
        }
        
        int answer = 0;
        
        for (int i=1; i<n+1; i++){
            if(clothes[i] >= 1){
                answer++;
            }
        }
        
        return answer;
    }
}