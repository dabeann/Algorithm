package lv1;

import java.util.*;

public class x만큼_간격이_있는_n개의_숫자 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];

        long xx = x;
        int index = 0;
        while (index != n) {
            answer[index++] = xx;
            xx += x;
        }

        return answer;
    }
}
