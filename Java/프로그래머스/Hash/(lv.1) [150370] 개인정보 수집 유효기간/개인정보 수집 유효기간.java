import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        // terms to month 해시맵 만들기
        Map<String, Integer> termsMonth = new HashMap<>();
        for (String term : terms){
            String[] t = term.split(" ");
            termsMonth.put(t[0], Integer.parseInt(t[1]));
        }
        System.out.println(termsMonth.toString());
        
        List<Integer> result = new LinkedList<>();
        for (int i=0; i<privacies.length; i++){
            if(isExpired(today, termsMonth, privacies[i])){ result.add(i+1); }
        }
        
        return result.stream().mapToInt(i->i).toArray();
    }
    
    public boolean isExpired(String today, Map<String, Integer> termsMonth, String privacy){
        String[] p = privacy.split(" ");
        int month = termsMonth.get(p[1]);
        
        if (dateToDays(today) - dateToDays(p[0]) >= (month*28)) {
            return true;
        }
        return false;
    }
    
    public int dateToDays(String date){
        String[] d = date.split("\\.");
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        
        return (year*12*28) + (month*28) + day;
    }
    
}

/*
문제 해석
- in  : 오늘 날짜, 약관 종류와 유효기간, 개인정보들(수집일, 약관)
- out : 오늘 날짜로 파기해야 할 개인정보 번호 (privacies index+1)
조건
- 수집된 개인정보는 유효기간 전까지만 보관
- 모든 달은 28일까지 있다고 가정

문제 해결
1. terms를 넣으면 개월 수를 알려주는 HashMap 만들기
2. privacies를 순회하며, expired 여부 확인

*/