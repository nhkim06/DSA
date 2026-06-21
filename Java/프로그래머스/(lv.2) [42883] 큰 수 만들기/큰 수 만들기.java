import java.util.Stack;

class Solution {
    public String solution(String number, int k) {
        // 문자열 리턴하면 돼서 StringBuilder를 스택으로
        StringBuilder sb = new StringBuilder();
        int length = number.length();
        
        for (int i=0; i<length; i++) {
            char num = number.charAt(i);
            
            // 스택이 비어있지 X, 지워야 할 숫자가 남음, 현재 숫자가 스택의 맨 뒤 숫자보다 크다면 스택 pop
            // => 큰 숫자만 남기기
            while (sb.length()>0 && k>0 && sb.charAt(sb.length() - 1) < num) {
                sb.deleteCharAt(sb.length()-1);
                k--;
            }
            sb.append(num);
        }
        
        // 만약 "9876"처럼 이미 내림차순이라 k가 남아있는 경우, 뒤에서부터 남은 k만큼 자름
        if (k>0) {
            sb.setLength( sb.length()-k );
        }
        
        return sb.toString();
    }
}

/*
문제 해석
return : number에서 k개의 수를 제거했을 때 얻는 가장 큰 수

문제 해결
- 가장 큰 수 찾고 그 다음으로 큰 수 찾아서 숫자 반환.
    - 고려할 점 : 두 숫자의 순서
        => 안됨
        => stack 사용

*/