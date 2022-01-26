package level1.같은_숫자는_싫어;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SolutionTest {

    Solution solution = new Solution();
    @ParameterizedTest
    @MethodSource("testData")
    void solution(int[] arr, int[] answer) {

        Assert.assertArrayEquals(answer, solution.solution(arr));

    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new int[]{1,1,3,3,0,1,1}, new int[]{1,3,0,1}),
                Arguments.of(new int[]{4,4,4,3,3}, new int[]{4,3})
        );
    }
}
