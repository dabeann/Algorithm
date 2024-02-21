package lv2;

import java.util.HashMap;

public class 의상 {
    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();

        for (String[] str : clothes) {
            if (map.containsKey(str[1])) {
                map.put(str[1], map.get(str[1]) + 1);
            } else {
                map.put(str[1], 1);
            }
        }

        for (int value : map.values()) {
            answer *= (value + 1);
        }

        return answer - 1;
    }
}
