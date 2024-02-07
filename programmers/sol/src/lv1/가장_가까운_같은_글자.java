package lv1;

import java.util.HashMap;

public class 가장_가까운_같은_글자 {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            if (!map.containsKey(a)) {
                answer[i] = -1;
                map.put(a, i);
            } else if (map.containsKey(a)){
                answer[i] = i-map.get(a);
                map.remove(a);
                map.put(a, i);
            }
        }

        return answer;
    }
}
