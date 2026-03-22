class Solution {
    public int solution(int[][] dots) {
        if (isParallel(dots[0], dots[1], dots[2], dots[3])) return 1;
        if (isParallel(dots[0], dots[2], dots[1], dots[3])) return 1;
        if (isParallel(dots[0], dots[3], dots[2], dots[1])) return 1;
        return 0;
    }
    
    private boolean isParallel(int[] a, int[] b, int[] c, int[] d){
        return (a[1]-b[1])/(a[0]-b[0]) == (c[1]-d[1])/(c[0]-d[0]);
    } 
    
}
/*
이렇게 했는데 실패 하나 뜸
원인 : 정수의 나눗셈이어서 소수점이 사라짐, 분모가 0 되는 경우도 고려 

        return (a[1]-b[1])*(c[0]-d[0]) == (c[1]-d[1])*(a[0]-b[0]);

*/ 