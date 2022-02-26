package level1.완주하지_못한_선수;

import java.util.Arrays;
import java.util.HashMap;

public class Soultion {
    public String solution(String[] participant, String[] completion) {

/*
        Arrays.sort(participant);
        Arrays.sort(completion);
        int i = 0;
        for (i = 0; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                return participant[i];
            }
        }
        return participant[i];

*/

        //해시맵으로 코드 리팩토링
        //효율성에서 더 좋게 나옴 이유는 ? ...

        HashMap<String, Integer> runners = new HashMap<>();

        Arrays.stream(participant).forEach(runner -> runners.put(runner, runners.getOrDefault(runner, 0) + 1));

        Arrays.stream(completion).forEach(runner -> runners.put(runner, runners.get(runner) - 1));

        for (String runner : runners.keySet()) {

            if (runners.get(runner) != 0) {
                return runner;
            }
        }
        return null;
    }
}
