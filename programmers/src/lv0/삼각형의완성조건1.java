package lv0;

import java.util.Arrays;

public class 삼각형의완성조건1 {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}
