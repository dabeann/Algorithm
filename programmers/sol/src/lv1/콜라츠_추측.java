package lv1;

public class 콜라츠_추측 {
    public int solution(long num) {
        int answer = 0;

        for (int i = 0; i < 500; i++) {
            if (num == 1) {
                return answer;
            } else if (num % 2 == 0) {
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            answer++;
        }

        return -1;
    }
}
