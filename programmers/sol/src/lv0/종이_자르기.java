package lv0;

class 종이_자르기 {
    public int solution(int M, int N) {
        int answer = 0;
        if (M*N !=1)    answer = M*N-1;

        return answer;
    }
}