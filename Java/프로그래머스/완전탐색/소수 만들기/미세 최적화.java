class Solution {
    
    public int solution(int[] nums) {        
        int count = 0;
        int n = nums.length;
        
        for(int i=0; i<n-2; i++){
            for (int j=i+1; j<n-1; j++){
                for (int k=j+1; k<n; k++){
                    int sum = nums[i] + nums[j] + nums[k];
                    if(isPrime(sum)) count++; 
                }
            }
        }
        
        return count;
    }
    
    public boolean isPrime(int num) {
        if (num == 2) return true;
        if (num < 2 || num % 2 == 0) return false;
        
        for (int i=3; i*i<=num; i+=2){
            if (num%i==0) return false;
        }
        return true;
    }

}



/*
문제 해결
1. 소수인지 검사하는 isPrime 함수
2. 완전탐색으로 일일이 합을 구해서 isPrime하기. => 효율 별로일 것 같은데
    - 숫자 3개를 어케 택할 것인가? n^3 방식으로 모든 경우 
    - 단축하기

*/