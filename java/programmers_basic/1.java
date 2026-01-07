/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120956?language=java
 */

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] words = new String[]{"aya", "ye", "woo", "ma"};
        
        for (String bab : babbling){
            int idx = 0;
            boolean matched = false;
            
            while(idx < bab.length()){
                matched = false;
                
                for (String word : words){
                    if (bab.startsWith(word, idx)){
                        idx += word.length();
                        matched = true;
                        break;
                    }
                }
                if (!matched) break;
            } 
            
            if (idx == bab.length()) answer++;

        }
        return answer;
    }
    
}

// 모든 경우의 조합을 비교 : 비효율적
// 각 단어와 일치하는지 조회, 일치한다면 나머지 단어들 이어서 조회
// O(mn)이 최선인가? 
