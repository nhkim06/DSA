import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) { 
        int[] answer = new int[commands.length];
        
        for (int c=0; c<commands.length; c++){
            int i = commands[c][0];
            int j = commands[c][1];
            int k = commands[c][2];

            int[] temp = Arrays.copyOfRange(array, i-1, j);
            Arrays.sort(temp);
            answer[c] = temp[k-1];
        }
        return answer;
    }

}


/*
문제 해석
1. i~j 만큼 자르고, (인덱스+1)
2. 정렬해서 여기서 k번째 수 구하기 (인덱스+1)

문제 해결
1. 말 그대로 slicing 하고 정렬해서 구하기
2. priority queue 에 넣었다 k번 꺼내면서 k번째 수 구하기

*/