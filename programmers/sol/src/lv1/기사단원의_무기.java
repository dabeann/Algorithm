package lv1;

public class 기사단원의_무기 {
    public int solution(int number, int limit, int power) {
        int answer = 0;

        for (int i = 1; i <= number; i++) {
            int count = 0;

            for(int j = 1; j <= Math.sqrt(i); j++){
                if(i % j == 0){ // j가 n의 약수일 때
                    if(j * j == i) count++; // j가 n의 제곱근일 경우 count 1만 증가
                    else count += 2; // 짝을 이루는 약수가 있으므로 count 2 증가
                }
            }
            if (count<=limit){
                answer+=count;
            } else {
                answer += power;
            }
        }

        return answer;
    }
}
