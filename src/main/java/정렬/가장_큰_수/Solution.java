package 정렬.가장_큰_수;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {

        /*
        1 2 3
        1 3 2
        2 1 3
        2 3 1
        3 2 1
        3 1 2
         */
        // 사고력 차이.. int로 어떻게 조합하나 하고 있었는데
        // String 으로 정렬하면 된다. 그러면 10보다 6이 먼저 정렬된다.

        String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }

        //Arrays.sort(T[] a, Comparator <? super T> c)
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        //아직 이부분이 잘 이해가 안된다.

        if (arr[0].equals("0")) {
            return "0";
        }
        return Arrays.stream(arr).collect(Collectors.joining());
    }
}
