package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 없는_숫자_더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int n : numbers) {
            list.add(n);
        }

        for (int i = 0; i < 10; i++) {
            if (!list.contains(i)) {
                answer+=i;
            }
        }

        return answer;
    }
}
