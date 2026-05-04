import java.util.*;

class Solution {
    public int[] solution(String s) {
        String[] nums = s.replaceAll("[{}]", "").split(",");
        Map<Integer, Integer> freq = new HashMap<>();
        int[] answer = new int[s.length()];
        
        // 각 숫자의 frequency HashMap에 계산
        for (String ns : nums){
            int n = Integer.parseInt(ns);
            freq.put( n , freq.getOrDefault(n, 0) + 1 );
        }
        
        // 빈도수 대로 정렬
        List<Integer> keySet = new ArrayList<>(freq.keySet());
        keySet.sort((a, b)-> freq.get(b) - freq.get(a));
        
        return keySet.stream().mapToInt(i->i).toArray();
    }
}