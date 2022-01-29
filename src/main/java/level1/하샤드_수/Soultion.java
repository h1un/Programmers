package level1.하샤드_수;

public class Soultion {
    public boolean solution(int x) {
        boolean answer = true;
        int inputnum = x;

        int sum = 0;

        while (x != 0) {
            sum += x % 10;
            x /= 10;
        }

        return inputnum % sum == 0 ? true : false;
    }
}
