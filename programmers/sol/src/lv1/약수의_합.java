package lv1;

public class 약수의_합 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (i * i == n) {
                answer += i;
            } else if (n % i == 0) {
                answer += i;
                answer += n/i;
            }
        }

        return answer;
    }
}
