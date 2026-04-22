import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        
        for (int m:moves){
            int col = m-1;
                
            for(int r=0; r<board.length; r++){
                if (board[r][col] == 0) continue;
                else {
                    if (stack.isEmpty() || board[r][col] != stack.peek()){
                        stack.push(board[r][col]);
                    }else {
                        stack.pop();
                        count += 2;
                    }
                    board[r][col] = 0;
                    break;
                }
            }
        }
        return count;
    }
}