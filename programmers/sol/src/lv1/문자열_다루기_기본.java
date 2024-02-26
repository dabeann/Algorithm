package lv1;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        boolean answer = true;

        if (s.length() != 4 && s.length() != 6) return false;
        if (s.matches(".*[a-zA-Z].*")) return false;

        return answer;
    }
}
