class Solution {
    boolean solution(String s) {
        int count = 0;        
        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if ( c == '(' ) count +=1;
            else if ( c == ')' ) {
                count -=1;
                if (count < 0) return false;
            }
            
        }
        return count == 0;
    }
}

/*
문제 해결 
1) '('를 만나면 stack에 넣는다. 
2) ')'를 만나면 pop한다. 
3) stack 안에 남아있는 ( 가 있으면 false, 없으면 true
*/