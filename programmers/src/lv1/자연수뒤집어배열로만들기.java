package lv1;


class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = new int[String.valueOf(n).length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}

//class 자연수뒤집어배열로만들기 {
//    class Solution {
//        public int[] solution(long n) {
//            return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//        }
//    }
//}
