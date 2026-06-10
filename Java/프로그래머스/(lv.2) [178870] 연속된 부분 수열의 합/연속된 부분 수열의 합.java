import java.util.Arrays;

class Solution {
    public int[] solution(int[] sequence, int k) {
        // 시작, 끝 인덱스
        int[] answer = new int[2];

        int left = 0;
        int right= 0;
        int currentSum = sequence[0];

        int minLength= Integer.MAX_VALUE;
        int n = sequence.length;

        while (left < n && right < n) {
            if (currentSum == k) {
                int currentLength = right - left;

                // 더 짧은 길이를 찾으면
                if (currentLength < minLength) {
                    minLength = currentLength;
                    answer[0] = left;
                    answer[1] = right;
                }
                currentSum -= sequence[left];
                left++;

            } else if (currentSum < k) {
                // 합이 k보다 작으면
                right++;
                if (right < n) {
                    currentSum += sequence[right];
                }

            } else {
                // 합이 k보다 크면
                currentSum -= sequence[left];
                left++;
            }
        }
        return answer;

    }

}