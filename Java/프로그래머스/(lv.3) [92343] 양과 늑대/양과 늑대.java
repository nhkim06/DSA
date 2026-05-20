import java.util.*;
class Solution {
    List<List<Integer>> list;
    int n;
    int[] info;
    int count = 0;
    public int solution(int[] info, int[][] edges) {
        this.list = new ArrayList<>();
        this.n = info.length;
        this.info = info;
        
        for (int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }
        
        for (int[] e : edges){
            list.get(e[0]).add(e[1]);
        }
        
        dfs(list.get(0), 0, 1);
        
        return count;
    }
    
    void dfs(List<Integer> nextNodes, int wolf, int sheep){
        if (count<sheep){
            count = sheep;
        }        
        for (int i=0; i< nextNodes.size(); i++){  
            int next = nextNodes.get(i);
            
            int nextSheep = info[next] == 0? sheep+1 : sheep;
            int nextWolf = info[next] == 1? wolf+1 : wolf;
            
            if(nextWolf >= nextSheep){
                continue;
            }
            
            List<Integer> newNextNodes = new ArrayList<>(nextNodes);
            newNextNodes.remove(i);
            
            for (int child : list.get(next)){
                newNextNodes.add(child);
            }
            
            dfs(newNextNodes, nextWolf, nextSheep);
        }
    }
}

/*
당신이 모은 양의 수보다 늑대의 수가 같거나 더 많아지면 바로 모든 양을 잡아먹어 버립니다. 당신은 중간에 양이 늑대에게 잡아먹히지 않도록 하면서 최대한 많은 수의 양을 모아서 다시 루트 노드로 돌아오려 합니다.

0은 양, 1은 늑대
*/