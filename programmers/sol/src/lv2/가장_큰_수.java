package lv2;

import java.util.Arrays;
import java.util.Comparator;

public class 가장_큰_수 {
    public String solution(int[] numbers) {
        String answer = "";

        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o2 + o1).compareTo(o1 + o2);
            }
        });
        if (strNumbers[0].equals("0")) {
            return "0";
        }
        for (String str : strNumbers) {
            answer += str;
        }

        return answer;
    }
}
