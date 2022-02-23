package 정렬.가장_큰_수;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void solution() {
        Assert.assertEquals("6210", solution.solution(new int[]{6, 10, 2}));
    }
}
