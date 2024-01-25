package lv0;

class 문자열_정수의_합 {
    public int solution(String num_str) {
        int answer = 0;

        for (char a : num_str.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(a));
        }

        return answer;
    }
}