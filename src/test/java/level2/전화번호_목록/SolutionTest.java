package level2.전화번호_목록;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SolutionTest {

    Solution solution = new Solution();
    @Test
    void solution() {
        Assert.assertFalse(solution.solution(new String[]{"119", "97674223", "1195524421"}));
    }
}
