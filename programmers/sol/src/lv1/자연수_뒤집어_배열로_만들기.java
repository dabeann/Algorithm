package lv1;

public class 자연수_뒤집어_배열로_만들기 {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] answer = new int[length];

        char[] chars = String.valueOf(n).toCharArray();
        for (int i = 0; i < length; i++) {
            answer[i] = Character.getNumericValue(chars[answer.length-i-1]);
        }

        return answer;
    }
}
