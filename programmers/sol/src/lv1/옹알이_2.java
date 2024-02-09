package lv1;

public class 옹알이_2 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String a : babbling) {
            int len = a.length();
            for (int i = 0; i < len; i++) {
                a = a.replace("ayaaya", "1");
                a = a.replace("yeye", "1");
                a = a.replace("woowoo", "1");
                a = a.replace("mama", "1");

                a = a.replace("aya", " ");
                a = a.replace("ye", " ");
                a = a.replace("woo", " ");
                a = a.replace("ma", " ");
            }
            for (int i = 0; i < len; i++) {
                a = a.replace(" ", "");
            }
            if (a.equals("")) answer++;
        }
        
        return answer;
    }
}
