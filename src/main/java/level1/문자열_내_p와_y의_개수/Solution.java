package level1.문자열_내_p와_y의_개수;

public class Solution {
    boolean solution(String s) {

        s = s.toUpperCase();

        return s.chars().filter(c -> c == 'P').count() == s.chars().filter(c -> c == 'Y').count();
    }
}

