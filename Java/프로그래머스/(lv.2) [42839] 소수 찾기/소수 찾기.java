import java.util.*;

class Solution {
    String numbers;
    boolean[] visited;
    int numLen;
    Set<Integer> set = new HashSet<>();
    
    public int solution(String numbers) {
        this.numbers = numbers;
        this.visited = new boolean[numbers.length()];
        dfs("");
        return set.size();
    }
    
    public void dfs(String curStr) {
        if (curStr.length() > 0 ) {
            int cur = Integer.parseInt(curStr);
            if( isPrime(cur) ) set.add(cur);
        }
        
        if (curStr.length() == numbers.length() ) return;
        
        for (int i=0; i<numbers.length(); i++){
            if(!visited[i]){
                visited[i] = true;
                
                dfs(curStr + numbers.charAt(i));
                visited[i] = false;
            }
        }
    }
    
    boolean isPrime(int n){
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        
        for (int i=3; i*i<=n; i+=2){
            if (n % i == 0) return false;
        }
        return true;
    }
}






/*
문제 해결
- numbers 개수가 적음 -> visited[] 배열 사용해서 중복 제거

*/