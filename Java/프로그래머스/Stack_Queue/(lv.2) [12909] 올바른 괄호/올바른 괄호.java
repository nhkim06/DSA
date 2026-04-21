import java.util.Stack;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack= new Stack<>();
        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if ( c == '(' ) stack.push(c);
            else if ( c == ')' ) {
                if (stack.isEmpty()) return false;
                stack.pop();
            
            }
            
        }
        return stack.isEmpty();
    }
}

/*
문제 해결 
1) '('를 만나면 stack에 넣는다. 
2) ')'를 만나면 pop한다. 
3) stack 안에 남아있는 ( 가 있으면 false, 없으면 true
*/