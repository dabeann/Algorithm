package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class 명예의_전당_1 {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> kk = new ArrayList<>();
        int i = 0;
        for (int a : score) {
            if (kk.size()<k){
                kk.add(a);
            } else { //꽉찬경우
                if (a > Collections.min(kk)) {
                    kk.remove(Collections.min(kk));
                    kk.add(a);
                }
            }
            answer[i++] = Collections.min(kk);
        }


        return answer;
    }
}
