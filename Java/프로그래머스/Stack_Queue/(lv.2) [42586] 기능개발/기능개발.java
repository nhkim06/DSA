import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int days = (int) Math.ceil((100.0-progresses[0])/speeds[0]);
        List<Integer> answer = new ArrayList<>();
        
        int count = 0;
        for (int i=0; i<progresses.length; i++){
            int curProgress = progresses[i] + days * speeds[i];
            if( curProgress >= 100 ){
                count++;
            }else{
                answer.add(count);
                count = 1;
                days += (int) Math.ceil((100.0-curProgress)/speeds[i]);
            }
        }
        answer.add(count);

        return answer.stream().mapToInt(i->i).toArray();
    }
}

/*
문제 해석
- in  : 작업 순서 + 진행도, 작업 속도
- out : 각 배포마다 몇 개의 기능이 배포되는지
조건 
- 앞에거가 완성되어야 뒤에거도 배포 가능. 

문제 해결
1. days로 며칠이 지났는지 카운트하기. 
    1) 일단 첫 번째꺼 배포할 날짜 계산
    2) 뒤에거 확인. 해당 날짜에 배포 가능하면 같이 배포
    3) 배포 불가하면 days 재계산
2. 작업 소요일 수 적혀있는 queue 만들고 배포일 확인 ⇒ 반목문으로만 풀어도되는데, 비효율적임.

*/