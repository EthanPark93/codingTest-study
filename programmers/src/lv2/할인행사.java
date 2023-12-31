package lv2;

import java.util.*;

public class 할인행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < want.length; i++) map.put(want[i], number[i]);

        outer:
        for(int i = 0; i < discount.length - 10 + 1; i++){
            Map<String, Integer> dMap = new HashMap<>();

            for (int j = 0; j < 10; j++) dMap.put(discount[i + j], dMap.getOrDefault(discount[i + j], 0) + 1);

            for (String key : map.keySet()) if (map.get(key) != dMap.get(key)) continue outer;

            answer++;
        }

        return answer;
    }
}
