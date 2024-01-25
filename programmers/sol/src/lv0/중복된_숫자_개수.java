package lv0;

class 중복된_숫자_개수 {
    public int solution(int[] array, int n) {
        int answer = 0;

        for (int a : array) {
            if (a==n) answer++;
        }

        return answer;
    }
}