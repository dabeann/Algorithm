package lv2;

import java.util.*;

public class 요격_시스템 {
    public int solution(int[][] targets) {
        int answer = 0;

        Arrays.sort(targets, (o1, o2) -> o1[1] - o2[1]);

        int before = 0;

        for (int[] target : targets) {
            if (before <= target[0]) {
                before = target[1];
                answer++;
            }
        }

        return answer;
    }
}
