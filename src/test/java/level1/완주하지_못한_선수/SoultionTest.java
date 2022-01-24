package level1.완주하지_못한_선수;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class SoultionTest {

    Soultion soultion = new Soultion();

    @ParameterizedTest
    @MethodSource("testData")
    void solution(String[] participant, String[] completion, String answer) {

        Assert.assertEquals(answer, soultion.solution(participant, completion));

    }

    private static Stream<Arguments> testData() {
        return Stream.of(
                Arguments.of(new String[]{"leo", "kiki", "eden"}, new String[]{"eden", "kiki"}, "leo"),
                Arguments.of(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"josipa", "filipa", "marina", "nikola"}, "vinko")
        );
    }
}
