package lv1;

public class 소수_찾기 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) answer++;
        }

        return answer;
    }

    private boolean checkPrime(int n) {
        if (n < 2) return false;

        int sqrtN = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
