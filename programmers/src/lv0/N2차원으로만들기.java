package lv0;

public class N2차원으로만들기 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];

        for (int i = 0; i < num_list.length; i++) answer[i/n][i%n]=num_list[i];

        return answer;
    }
}
