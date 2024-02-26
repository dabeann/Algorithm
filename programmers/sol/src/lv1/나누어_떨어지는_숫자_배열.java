package lv1;

import java.util.*;

public class 나누어_떨어지는_숫자_배열 {
    public Integer[] solution(int[] arr, int divisor) {
        List<Integer> list = new ArrayList<>();

        for (int a : arr) {
            if (a % divisor == 0) {
                list.add(a);
            }
        }
        Collections.sort(list);
        if (list.size() == 0) list.add(-1);
        return list.toArray(new Integer[0]);
    }
}
