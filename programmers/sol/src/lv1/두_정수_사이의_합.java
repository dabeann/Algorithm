package lv1;

public class 두_정수_사이의_합 {
    public long solution(int a, int b) {
        long answer = 0;

        if (a == b) return a;
        else if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        // a가 큰값으로 세팅
        for (int i = b; i <= a; i++) {
            answer += i;
        }

        return answer;
    }
}
