package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class 과일_장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;

        List<Integer> list = new ArrayList<>();
        for (int s : score) {
            list.add(s);
        }

        HashMap<Integer, Integer> map = new HashMap<>(); // 점수, 빈도수
        for (int i = 1; i <= k; i++) {
            int f = Collections.frequency(list, i);
            map.put(i, f);
        }
        int remain = 0;
        for (int i = k; i > 0; i--) {
            if (map.containsKey(i)) {
                remain += map.get(i);

                // 한 상자에 담을 수 있는 개수로 나누어 계산
                int boxes = remain / m;
                remain %= m;

                // 최대 이익 계산
                answer += boxes * m * i;
            }
        }


        return answer;
    }
}
