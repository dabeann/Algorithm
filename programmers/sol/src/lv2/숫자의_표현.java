package lv2;

public class 숫자의_표현 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int ii = i;
            while (sum < n){
                sum += ii++;
            }
            if (sum == n) answer++;
        }

        return answer;
    }
}
