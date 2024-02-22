package lv2;

import java.util.*;

// number.length() - k 자리수만큼 구해야 한다.
// 자리수가 n이라고 치면, 뒤에서 n-1개 만큼 빼고 앞에서 최댓값을 구한다.
// 답에 추가하고, 그 index 기준으로 남은 자리수만큼 빼놓고 최대값을 구한다.
// + 시간때문에 StringBuilder사용하자
public class 큰_수_만들기 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int len = number.length() - k;
        int start = 0;

        while(start < number.length() && answer.length() != len) {
            int leftNum = k + answer.length() + 1;
            int max = 0;
            for (int j = start; j < leftNum; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            answer.append(max);
        }
        return answer.toString();
    }
}
