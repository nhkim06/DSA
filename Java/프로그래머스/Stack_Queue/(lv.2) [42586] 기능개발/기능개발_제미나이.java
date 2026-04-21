import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        
        int maxDay = (100 - progresses[0] + speeds[0] - 1) / speeds[0];
        int count = 1;

        for (int i = 1; i < progresses.length; i++) {
            int currentDay = (100 - progresses[i] + speeds[i] - 1) / speeds[i];

            if (currentDay <= maxDay) {
                count++;
            } else {
                answer.add(count);
                count = 1;
                maxDay = currentDay;
            }
        }
        answer.add(count);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}
