package level1.x만큼_간격이_있는_n개의_숫자;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    Solution solution = new Solution();

    @Test
    public void solution() {
        int x = 2;
        int n = 6;
        long[] answer = {2, 4, 6, 8, 10, 12};
        long[] test = solution.solution(x, n);

        Assert.assertArrayEquals(answer, test);
    }
}
