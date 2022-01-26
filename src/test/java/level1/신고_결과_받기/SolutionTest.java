package level1.신고_결과_받기;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();
    @ParameterizedTest
    @MethodSource("testData")
    void solution(String[] id_list , String[] report, int k , int[] result) {

        Assert.assertArrayEquals(result, solution.solution(id_list,report,k));
    }

    private static Stream<Arguments> testData(){
        return Stream.of(
               Arguments.of(new String[]{"muzi", "frodo", "apeach", "neo"},new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},2,new int[]{2,1,1,0}),
               Arguments.of(new String[]{"con", "ryan"},new String[]{"ryan con", "ryan con", "ryan con", "ryan con"},3,new int[]{0,0})
        );
    }
}
