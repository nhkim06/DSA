class Solution {
    boolean solution(String s) {
        int len = s.length();
        int count = 0;        
        if (len % 2 != 0) return false;

        for (int i = 0; i < len; i++) {
            if ( s.charAt(i) == '(' ) {
                count++;
            } else {
                if (count <= 0) return false;
                count--;
            }

        }
               
        return count==0;
    }
}

/*
문제 풀이
1. stack 사용하기 => ArrayDequeue 사용하면 더 빠름
2. 괄호 (개수 count하면서 트래킹 하기

*/