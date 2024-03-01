package lv2;

import java.util.*;

public class N개의_최소공배수 {
    public int solution(int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        answer = arr[arr.length - 1];
        while (true) {
            int match = 0;
            for (int j : arr) {
                if (answer % j == 0) {
                    match++;
                }
            }
            if (match == arr.length) return answer;
            answer++;
        }
    }
}
