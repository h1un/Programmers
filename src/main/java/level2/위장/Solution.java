package level2.위장;

import java.util.Arrays;
import java.util.HashMap;

import static java.util.stream.Collectors.*;

public class Solution {

    public int solution(String[][] clothes) {

        /*

        //단순 조합 개수만 구하는거기 때문에 개수만 저장
        // 조합 수  = (의상개수 + 1(착용하지 않음)) * --- * (의상 개수 +1) - (아무것도 착용하지 않은상태(최소 한개의 의상을 입어여한다.))
        HashMap<String, Integer> clothesMap = new HashMap<>();

        for (String[] clothesSet : clothes) {
            clothesMap.put(clothesSet[1], clothesMap.getOrDefault(clothesSet[1], 0) + 1);
        }

        int answer = 1;

        for (String clothesType : clothesMap.keySet()) {
            answer *= (clothesMap.get(clothesType) + 1);
        }


        return answer - 1;
    */

        return Arrays.stream(clothes)
                .collect(groupingBy(p -> p[1], mapping(p -> p[0], counting())))
                .values()
                .stream()
                .collect(reducing(1L, (x, y) -> x * (y + 1))).intValue() - 1;


    }

}
