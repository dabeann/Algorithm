package lv2;

public class 다음_큰_숫자 {
    public int solution(int n) {
        int countOne = Integer.bitCount(n); // n의 비트 중 1의 개수
        int answer = n + 1;

        while (Integer.bitCount(answer) != countOne) {
            answer++;
        }

        return answer;
    }
}
