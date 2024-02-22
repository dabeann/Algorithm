package lv2;

public class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = {0, 0};

        int total = brown + yellow;
        int h = 0;
        int w = 0;
        for (int i = 1; i <= total; i++) {
            if (total % i == 0) {
                w = i;
                h = total/i;

                if ((2 * h + 2 * (w - 2) == brown) && total-(2 * h + 2 * (w - 2)) == yellow) {
                    answer[1] = w;
                    answer[0] = h;
                    return answer;
                }
            }
        }

        return answer;
    }
}
