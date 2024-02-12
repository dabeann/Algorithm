package lv1;

public class _3진법_뒤집기 {
    public int solution(int n) {
        int answer = 0;

        String trinary = "";
        while (n > 0) {
            int remainder = n % 3;
            n /= 3;
            trinary += String.valueOf(remainder);
        }
        answer = Integer.parseInt(trinary, 3);

        return answer;
    }
}
