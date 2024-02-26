package lv1;

public class 시저_암호 {
    public String solution(String s, int n) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){ // 소문자일 경우
                answer += (char) ('a' + (s.charAt(i) - 'a' + n) % 26);
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') { // 대문자일 경우
                answer += (char) ('A' + (s.charAt(i) - 'A' + n) % 26);
            } else {
                answer += s.charAt(i);
            }
        }

        return answer;
    }
}
