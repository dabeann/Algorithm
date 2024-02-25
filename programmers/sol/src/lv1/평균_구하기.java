package lv1;

import java.util.Arrays;

public class 평균_구하기 {
    public double solution(int[] arr) {
        double answer = 0;

        answer = (double) Arrays.stream(arr).sum() / arr.length;

        return answer;
    }
}
