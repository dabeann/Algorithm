package lv2;

import java.util.*;

public class 압축 {
    public int[] solution(String msg) {
        List<Integer> list = new ArrayList<>();
        List<String> indexList = new ArrayList<>();
        indexList.add("0");
        char c = 'A';
        for (int i = 1; i <= 26; i++) {
            indexList.add(String.valueOf(c));
            c++;
        } // A-Z / 1-26

        int maxLen = 1;
        while (!msg.equals("")) {
            for (int i = maxLen; i > 0; i--) {
                if (i <= msg.length()){
                    String str = msg.substring(0, i);
                    if (indexList.contains(str)) {
                        list.add(indexList.indexOf(str));
                        if (msg.length() > i) {
                            indexList.add(str + msg.charAt(i));
                            maxLen++;
                        }
                        msg = msg.substring(i);
                        break;
                    }
                }
            }
        }


        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
