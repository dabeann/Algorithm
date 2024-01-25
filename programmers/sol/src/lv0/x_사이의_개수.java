package lv0;

import java.util.ArrayList;
import java.util.List;

class x_사이의_개수 {
    public int[] solution(String myString) {
        List<Integer> list = new ArrayList<>();

        int index = 0;
        for (char a : myString.toCharArray()) {
            if (a == 'x') {
                list.add(index);
                index = 0;
            } else {
                index++;
            }
        }
        // Add the last substring length
        list.add(index);

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
