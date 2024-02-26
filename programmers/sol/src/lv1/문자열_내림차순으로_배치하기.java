package lv1;

import java.util.Arrays;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
    }
}
