class Solution {
    int count = 0;
    int answer = 0;
    String vowels = "AEIOU";

    public int solution(String word) {
        dfs("", word);
        return answer;
    }
    
    public void dfs(String current, String word){
        if (current.equals(word)) {
            answer = count;
            return;
        }
        if (current.length() == 5) return;
        
        for (int i=0; i<vowels.length(); i++){
            if (answer > 0) return;
            count ++;
            dfs(current + vowels.charAt(i), word);
            
        }
    }
}

/*
문제 해결
1. 미리 모든 가능한 경우를 hashmap에 저장해놓고 바로 조회 : 
    - 결국 전체를 순회한 후에 찾는거니 1회성 메소드엔 비효율적.
2. 모든 경우 탐색하며 count하다가, 만약 word와 일치하면 count return 
    - DFS vs BFS : '모든 경우' 문제는 DFS
3. charAt() 사용해서 순서 계산? 5진수 느낌이 나는게 뭔가 계산할 수 있을 것 같음
    - 예상
        - 5^4 + 5^3 + 5^2 + 5^1 + 5^0 = 781
        - 5^3 + 5^2 + 5^1 + 5^0 = 156
        - 5^2 + 5^1 + 5^0 = 31
        - 5^1 + 5^0 = 6
        - 5^0 = 1
        여기에 글자 인덱스 k를 곱하여 계산하면 되지 않을까

*/