package lv1;

import java.util.*;

public class 정수_내림차순으로_배치하기 {
    public long solution(long n) {
        char[] digits = Long.toString(n).toCharArray();

        Arrays.sort(digits);
        StringBuilder result = new StringBuilder(new String(digits)).reverse();

        return Long.parseLong(result.toString());
    }
}
