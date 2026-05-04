import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Map<String, Integer> hashmap = new HashMap<>();
        
        for (String pb : phone_book) hashmap.put(pb, 1);
        for (String pb : phone_book){
            for (int i=0; i<pb.length(); i++){
                if(hashmap.containsKey(pb.substring(0, i))) return false;
            }
        }
        
        return true;
    }
}

/*
문제 해석
1. 접두어인 경우 -> false, 접두어 없으면 true


문제 해결
1. 일일이 비교 -> O(n^2)
2. sort 사용
3. hash 사용


*/