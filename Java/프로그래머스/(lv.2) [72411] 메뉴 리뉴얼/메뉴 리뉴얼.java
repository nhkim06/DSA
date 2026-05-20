import java.util.*;
class Solution {
    String[] orders;
    int[] course;
    int n;
    Map<String, Integer> map;
    public String[] solution(String[] orders, int[] course) {
        this.orders = orders;
        this.course = course;
        this.n = orders.length;
        List<String> answerList = new ArrayList<>();
        
        // orders의 각 메뉴 정렬
        for(int i=0; i<n; i++){
            char[] chars = orders[i].toCharArray();
            Arrays.sort(chars);
            orders[i] = String.valueOf(chars);
        }
        
        for(int len : course){
            map = new HashMap<>();
            int maxCount = 0;
            
            for (String order : orders){
                if (order.length()>=len) backtrack(order, len, "", 0);
            }
            
            for (int count : map.values()){
                if (count >= 2 && maxCount < count) maxCount = count;
            }
            
            for (String key : map.keySet()){
                if (maxCount >= 2 && map.get(key) == maxCount){
                    answerList.add(key);
                }
            }
        }
        
        Collections.sort(answerList);
        return answerList.toArray(new String[0]);
    }
    
    void backtrack(String order, int len, String cur, int start){
        if (cur.length() == len){
            map.put(cur, map.getOrDefault(cur, 0)+1);
            return;
        }
        
        for (int i=start; i<order.length(); i++){
            backtrack( order, len, cur+order.charAt(i), i+1);
        }
        
    }
}

/*
문제 해석
- 최소 2가지 이상의 단품메뉴로 코스 요리 만들기
- 자주 나오는 조합을 
- 

문제 해결


*/