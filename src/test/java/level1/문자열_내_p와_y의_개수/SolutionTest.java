package level1.문자열_내_p와_y의_개수;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SolutionTest {

    Solution solution = new Solution();

    @ParameterizedTest
    @CsvSource({"pPoooyY, true", "Pyy, false"})
    public void solution(String s, boolean b) {
        Assert.assertSame(solution.solution(s), b);
    }
}
