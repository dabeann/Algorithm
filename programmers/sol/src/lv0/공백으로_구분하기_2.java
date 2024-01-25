package lv0;

class 공백으로_구분하기_2 {
    public String[] solution(String my_string) {
        String[] answer = my_string.trim().split("\\s+");

        return answer;
    }
}