import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int last = arr[0];
        list.add(arr[0]);
        
        for (int i=1; i<arr.length; i++){
            if (arr[i] != last){
                list.add(arr[i]);
                last = arr[i];
            }
        }
        
        return list.stream().mapToInt(i->i).toArray();
    }
}

/*
문제 해결
1. stack 사용하기. => O(n)
    1) peek 했을 때 만약 값이 현재 인덱스의 배열 값과 같다면 넘어가고
    2) 만약 값이 다르다면 push 하기. 
    3) stack을 int[]로  변환
2. 더 빠른 ArrayList만 사용하기
    1) ArrayList에 배열의 첫 요소 넣고 last를 배열의 첫 요소로 설정하기
    2) 순차적으로 배열의 값들을 last와 비교하며
        - 만약 현재 배열값 == last라면 넘어가고,
        - 아니라면 ArrayList에 현재 배열 값 삽입. last를 현재 배열값으로 업데이트
    

*/