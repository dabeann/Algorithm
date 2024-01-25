package lv0;

import java.util.Arrays;

class 문자열_묶기 {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[30];

        for (String a : strArr) {
            arr[a.length()-1]++;
        }

        answer = Arrays.stream(arr).max().orElse(0);


        return answer;
    }
}