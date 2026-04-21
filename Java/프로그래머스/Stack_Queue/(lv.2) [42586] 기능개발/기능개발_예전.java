import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int n = progresses.length;
        
        // days 배열 설정
        int[] days = new int[n];
        for (int i=0 ; i<n ; i++){
            if ((100-progresses[i])%speeds[i] == 0) days[i] = (100-progresses[i])/speeds[i];
            else days[i] = (100-progresses[i])/speeds[i] + 1;
            System.out.println(days[i]);
        }
        int prev = days[0];
        int count = 1;
        Stack<Integer> stack = new Stack<>();
        
        // days 배열 내 비교
        for (int i=1 ; i<n ; i++){
            if (days[i] <= prev){
                count++;
            }else{
                stack.push(count);
                prev = days[i];
                count = 1;
            }
        }
        stack.push(count);
        
        int[] deploy = new int[stack.size()];
        for (int i = stack.size()-1; i>=0; i--){
            deploy[i] = stack.pop();
        }
        
        
        return deploy;
    }
}