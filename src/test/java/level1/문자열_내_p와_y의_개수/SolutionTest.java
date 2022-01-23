package level1.문자열_내_p와_y의_개수;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    Solution solution = new Solution();
    @Test
    public void solution() {

        boolean b = solution.solution("pPoooyY");

        Assert.assertTrue(b);

    }
}
