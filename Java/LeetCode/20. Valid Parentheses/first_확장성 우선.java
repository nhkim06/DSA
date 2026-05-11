import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        for (int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if (map.containsKey(c)){ // 닫는 괄호인가?
                // stack의 top이 짝인가?
                if (stack.peek() == map.get(c)) stack.pop();
                else return false;
            }
            else stack.push(c);
        }

        return stack.isEmpty();
    }
}

/*
문제 해결
- 닫는 괄호인가 : map.containsKey(s.charAt(i))

 */