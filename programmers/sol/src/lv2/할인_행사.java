package lv2;

import java.util.*;

public class 할인_행사 {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;

        for (int i = 0; i < discount.length; i++) {
            String[] d = Arrays.copyOfRange(discount, i, i + 10); // 크기가 10넘으면? -> 걍 실행되네
            int correct = 0;
            for (int j = 0; j < number.length; j++) {
                if (Collections.frequency(Arrays.asList(d), want[j]) == number[j]) {
                    correct++;
                }
            }
            if (correct == number.length) answer++;
        }

        return answer;
    }
}
