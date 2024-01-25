package lv0;

class 머쓱이보다_키_큰_사람 {
    public int solution(int[] array, int height) {
        int answer = 0;

        for (int a : array) {
            if(a>height)answer++;
        }

        return answer;
    }
}