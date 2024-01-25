package lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class 문자열_정렬하기_2 {
    public String solution(String my_string) {
        String answer = "";

        my_string = my_string.toLowerCase();
        char[] st = my_string.toCharArray();
        Arrays.sort(st);

        return String.valueOf(st);
    }
}