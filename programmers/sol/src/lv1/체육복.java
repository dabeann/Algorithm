package lv1;

import java.util.Arrays;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length; // 전체 학생 수에서 도난당한 학생 수를 뺀다

        Arrays.sort(lost);
        Arrays.sort(reserve);

        // 여벌의 체육복을 가져온 학생이 도난당한 경우를 처리
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = -1; // 여벌이 있는데 도난당한 경우, 해당 학생은 체육복이 있는 것으로 간주하고 -1로 표시
                    reserve[j] = -1;
                    answer++; // 체육복을 입은 학생 수 증가
                    break;
                }
            }
        }
        // 도난당한 학생에게 체육복 빌려주기
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (reserve[j] != -1 && Math.abs(lost[i] - reserve[j]) == 1) {
                    reserve[j] = -1; // 체육복을 빌려준 학생은 -1로 표시
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }
}
