package lv2;

import java.util.*;

public class H_Index {
    public int solution(int[] citations) {
        int answer = 0;

        for (int i = citations.length; i >= 0; i--) {
            int m = 0;
            for (int j = 0; j < citations.length; j++) {
                if (i <= citations[j]) {
                    m++;
                }
            }
            if (m >= i) {
                return i;
            }
        }

        return answer;
    }
}
