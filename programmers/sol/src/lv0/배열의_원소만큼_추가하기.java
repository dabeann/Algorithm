package lv0;

import java.util.ArrayList;
import java.util.List;

class 배열의_원소만큼_추가하기 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for (int a : arr) {
            for (int i = 0; i < a; i++) {
                answer.add(a);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}