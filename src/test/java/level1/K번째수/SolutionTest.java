package level1.K번째수;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void solution() {

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Assert.assertArrayEquals(new int[]{5, 6, 3}, solution.solution(array, commands));

    }
}
