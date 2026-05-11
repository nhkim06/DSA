class Solution {
    public int[] solution(int[] prices) {
        int n = prices.length;
        int[] answer = new int[n];
        
        for (int i=0; i<n-1; i++){
            for (int j=i+1; j<n; j++){
                answer[i]++;
                if (prices[i] > prices[j]){
                    break;
                }
            }
        }
        
        return answer;
    }
}


/*
문제 해결
- 완전 탐색 : i안 j for문으로 하나씩 확정해나가기
*/