package lv1;

public class 둘만의암호 {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            for (int j = 0; j < index; j++) {
                c += 1;
                if (c > 'z') {
                    answer += 'a';
                    break;
                }
                if (skip.contains(String.valueOf(c))) j--;
            }

            answer += c;
        }

        return answer;
    }
}
