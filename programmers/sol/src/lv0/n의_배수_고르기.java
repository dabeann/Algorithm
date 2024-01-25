package lv0;

import java.util.ArrayList;
import java.util.List;

class n의_배수_고르기 {
    public int[] solution(int n, int[] numlist) {
        List<Integer> list = new ArrayList<>();

        for (int a : numlist) {
            if (a % n == 0) {
                list.add(a);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}