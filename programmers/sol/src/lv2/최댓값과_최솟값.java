package lv2;

public class 최댓값과_최솟값 {
    public String solution(String s) {
        String answer = "";

        String[] st = s.split(" ");
        int min = Integer.parseInt(st[0]);
        int max = Integer.parseInt(st[0]);
        for (int i = 0; i < st.length; i++) {
            int sint = Integer.parseInt(st[i]);
            if (sint<min) min = sint;
            if (sint>max) max = sint;
        }
        answer = min + " " + max;

        return answer;
    }
}
