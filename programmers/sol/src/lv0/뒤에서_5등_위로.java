package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 뒤에서_5등_위로 {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        List<Integer> answer = new ArrayList<>();
        for (int a : num_list) {
            answer.add(a);
        }
        for (int i = 0; i < 5; i++) {
            answer.remove(0);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}