package lv0;

class 저주의_숫자_3 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i < n+1; i++) {
            answer++;
            while (answer % 3 == 0 || String.valueOf(answer).contains("3")) {
                answer++;
            }

        }

        return answer;
    }
}