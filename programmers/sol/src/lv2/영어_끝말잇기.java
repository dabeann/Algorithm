package lv2;

import java.util.*;

public class 영어_끝말잇기 {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};

        Set<String> wordSet = new HashSet<>();
        char lastChar = words[0].charAt(0);

        for (int i = 0; i < words.length; i++) {
            if (wordSet.contains(words[i]) || words[i].charAt(0) != lastChar) {
                answer[0] = (i % n) + 1;
                answer[1] = (i / n) + 1;
                break;
            }
            wordSet.add(words[i]);
            lastChar = words[i].charAt(words[i].length() - 1);
        }
        return answer;
    }
}
