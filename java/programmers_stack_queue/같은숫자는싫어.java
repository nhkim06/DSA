import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for (int i=1; i<arr.length; i++){
            if (stack.peek() != arr[i]){
                stack.push(arr[i]);
            }
        }
        
        return stackToArray(stack);
    }
    
    private int[] stackToArray(Stack<Integer> stack){
        int[] array = new int[stack.size()];
        for (int i=stack.size(); i>0; i--){
            array[i-1] = stack.pop();
        }
        return array;
    }
}

/*
1. stack를 활용해 top에 있는 것과 아닌것
2. arr 길이만큼의 배열 만들고, reer와 arr 원소 값을 비교. 마지막에 배열 슬라이싱하면 어짜피 O(n)
*/