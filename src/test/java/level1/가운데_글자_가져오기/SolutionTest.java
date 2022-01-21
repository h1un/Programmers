package level1.가운데_글자_가져오기;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void solution() {

        String s = "abcde";
        String answer = "c";
        String test = solution.solution(s);

        Assert.assertEquals(answer,test);
    }
}
