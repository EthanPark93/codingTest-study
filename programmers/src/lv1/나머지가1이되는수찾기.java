package lv1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        for (int i = 1; ; i++) if (n % i == 1) return i;
    }
}
