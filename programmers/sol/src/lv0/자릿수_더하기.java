package lv0;

class 자릿수_더하기 {
    public int solution(int n) {
        int answer = 0;

        String num = String.valueOf(n);
        for (char a : num.toCharArray()) {
            answer += Integer.parseInt(String.valueOf(a));
        }

        return answer;
    }
}