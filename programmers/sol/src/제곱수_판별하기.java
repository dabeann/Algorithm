class 제곱수_판별하기 {
    public int solution(int n) {
        int answer = 2;

        for (int i = 0; i < n/2; i++) {
            if (i*i==n) answer = 1;
        }

        return answer;
    }
}