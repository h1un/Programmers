package level2.위장;

import java.util.HashMap;

public class Solution {

    public int solution(String[][] clothes) {

        HashMap<String, String> clothesMap = new HashMap<>();

        for (String[] clothesSet : clothes) {
            //키 , 값
            clothesMap.put(clothesSet[0], clothesSet[1]);

        }

        clothesMap.forEach((s, s2) -> System.out.println(s + "   " + s2));

        int answer = 0;

        return answer;
    }

}
