package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = commands[i][0]; j < commands[i][1]+1; j++) {
                list.add(array[j-1]);
            }
            Collections.sort(list);
            answer[i] = list.get(commands[i][2]-1);
        }

        return answer;
    }
}
