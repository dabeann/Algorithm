package lv0;

class 연속된_수의_합 {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        int start = (total/num) - ((num - 1)/2);

        for(int i = 0; i < num; i++) {
            answer[i] = start;
            start++;
        }

        return answer;
    }
}