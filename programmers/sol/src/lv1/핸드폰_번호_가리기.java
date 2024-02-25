package lv1;

public class 핸드폰_번호_가리기 {
    public String solution(String phone_number) {
        String answer = "";

        int len = phone_number.length()-4;
        answer = "*".repeat(len) + phone_number.substring(len);

        return answer;
    }
}
