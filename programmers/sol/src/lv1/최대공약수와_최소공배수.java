package lv1;

public class 최대공약수와_최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = {1, n * m};

        // 최대공약수 구하기
        for (int i = 2; i <= Math.min(n, m); i++) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
            }
        }

        // 최소공배수 구하기
        for (int i = Math.max(n, m); i <= n * m; i += Math.max(n, m)) {
            if (i % n == 0 && i % m == 0) {
                answer[1] = i;
                break;
            }
        }

        return answer;
    }
}
