package lv1;

public class 하샤드_수 {
    public boolean solution(int x) {
        boolean answer = true;

        String str = String.valueOf(x);
        int t = 0;
        for (int i = 0; i < str.length(); i++) {
            t += Integer.valueOf(String.valueOf(str.charAt(i)));
        }
        if (x % t != 0) answer = false;

        return answer;
    }
}
