import java.util.*;
class Solution {
    String[][] relation;
    int colN, rowN;
    boolean[] visited;
    List<Set<Integer>> uniqueKeys = new ArrayList<>();
    List<Set<Integer>> candidateKeys = new ArrayList<>();
    public int solution(String[][] relation) {
        this.relation = relation;
        this.colN = relation[0].length;
        this.rowN = relation.length;
        this.visited = new boolean[colN];
        
        backtrack(new HashSet<>(), 0);
        uniqueKeys.sort((a, b)-> Integer.compare(a.size(), b.size()));
        for(Set<Integer> keys : uniqueKeys){
            if(isLeast(keys)) candidateKeys.add(keys);
        }        
        return candidateKeys.size();
    }
    
    void backtrack(Set<Integer> cur, int num){
        if(!cur.isEmpty() && isUnique(cur)) {
            uniqueKeys.add(new HashSet<>(cur));
            return;
        }
        for (int i=num; i<colN; i++){
            if (!visited[i]){
                visited[i] = true;
                cur.add(i);
                backtrack(cur, i+1);
                cur.remove(i);
                visited[i] = false;
            }            
        }
    }
    
    boolean isUnique(Set<Integer> colIdx){
        Set<String> set = new HashSet<>();
        
        for (int r=0; r<rowN; r++){
            String s = "";
            for (int c : colIdx){
                s += relation[r][c] + "/";
            }
            set.add(s);
        }
        
        return set.size() == rowN;
    }
    
    
    boolean isLeast(Set<Integer> colIdx){
        for (Set<Integer> ck : candidateKeys){
            if (colIdx.containsAll(ck)) return false;
        }
        
        return true;
    }
    
}


/*
문제 해석
- 유일성
- 최소성
- 후보 키의 최대 개수

문제 해결
- subset 형태로 재귀호출
- 조건 유일성 검사, 최소성 검사 => 불만족 시 리턴
- col = relation의 idx
- 유일성 : 중복된 값이 있는가 검사
- 최소성 : 

*/