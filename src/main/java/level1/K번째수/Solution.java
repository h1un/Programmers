package level1.K번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {

        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {

            int[] array_ = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(array_);
            answer[i] = array_[commands[i][2] - 1];
        }
        return answer;
    }
}
