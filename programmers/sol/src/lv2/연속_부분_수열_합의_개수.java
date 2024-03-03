package lv2;

import java.util.*;

public class 연속_부분_수열_합의_개수 {
    public int solution(int[] elements) {
        Set<Integer> set = new HashSet<>();

        int len = elements.length;
        for (int i = 0; i < len; i++) {
            int v = elements[i];
            set.add(v);
            for (int j = i+1; j < i+len; j++) {
                v += elements[j%len];
                set.add(v);
            }
        }
        return set.size();
    }
}
