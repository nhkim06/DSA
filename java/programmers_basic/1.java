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