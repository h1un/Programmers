package level1.같은_숫자는_싫어;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int[] temp = new int[arr.length];
        // answer 배열의 크기 <= arr 배열의 크기
        // 연속된 숫자가 없는 경우에만 같기 때문에 temp는 최대의 크기로 선언
        int point = 0; // temp의 마지막 원소 인덱스
        temp[0] = arr[0]; // 첫 원소는 무조건 들어가니까
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != temp[point]) { // temp의 마지막 원소와 비교
                point++;
                temp[point] = arr[i];
            }
        }
        answer = Arrays.copyOf(temp, point + 1); // temp 배열의 유효한 값만 추출
        return answer;
    }
}
