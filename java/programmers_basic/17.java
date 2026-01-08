/*
    link : https://school.programmers.co.kr/learn/courses/30/lessons/120902
 */
import java.util.Scanner;

class Solution {
    public int solution(String my_string) {
        Scanner sc = new Scanner(my_string);     
        int total = Integer.parseInt(sc.next());
        
        while(sc.hasNext()){
            String op = sc.next();
            int num = Integer.parseInt(sc.next());
            if ( op.equals("+") ) total += num;
            else total -= num;
        }
        
        return total;
    }
}

/*
    문제 해결
        1. Linked list에 operator, number 분리해 저장한 뒤 연산 수행 ⇒ 과도한 메모리 사용
        2. 어짜피 연산자 +, - 밖에 없어서, operator 다음에는 무조건 숫자 온다고 가정.
            ⇒ 변수 하나 놓고 중첩해서 연산하기
 */