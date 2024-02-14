package lv1;

public class 약수의_개수와_덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            if (num(i) % 2 == 0) {
                answer+=i;
            } else {
                answer -= i;
            }
        }


        return answer;
    }

    private int num(int n) {
        int number = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n%i==0){
                if (n/i==i) number++;
                else number += 2;
            }
        }
        return number;
    }
}
