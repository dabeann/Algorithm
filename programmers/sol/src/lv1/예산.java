package lv1;

import java.util.*;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);
        int total = 0;
        for (int don : d) {
            if (total + don <= budget) {
                total += don;
                answer++;
            }
        }

        return answer;
    }
}
