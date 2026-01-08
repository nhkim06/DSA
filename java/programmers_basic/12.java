/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 */

import java.util.Scanner;

class Solution {
    public String[] solution(String[] quiz) {
        int len = quiz.length;
        String[] ans = new String[len];
        
        for(int i=0; i<len; i++){
            String[] ops = quiz[i].split(" ");
            
            int a = Integer.parseInt(ops[0]);
            String op = ops[1];
            int b = Integer.parseInt(ops[2]);
            int res = Integer.parseInt(ops[4]);
            
            if(op.equals("+")) ans[i] = a+b==res? "O" : "X" ;
            else if(op.equals("-")) ans[i] = a-b==res? "O" : "X" ;
            else if(op.equals("*")) ans[i] = a*b==res? "O" : "X" ;
            else if(op.equals("/")) ans[i] = a/b==res? "O" : "X" ;
            
        }
        return ans;
    }
}

/*
    문제 해결
        프로그래머스 코테 입문 문제 중 “문자열 계산하기”의 심화버전 같다는 생각이 듦. 
        비슷하게 scanner로 string의 값들을 불러온 뒤, next()로 각 값을 적당한 데이터형의 변수에 할당하여 비교

        BUT. GPT에 의하면 Scanner은 split()보다 느림.
            ⇒ split() 활용해서 코드 다시 작성
*/