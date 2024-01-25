package lv0;

class 숫자_찾기 {
    public int solution(int num, int k) {
        int answer = 1;

        String num1 = Integer.toString(num);
        char num2 = Integer.toString(k).charAt(0);

        for (char a : num1.toCharArray()) {
            if (a == num2) {
                break;
            }
            answer++;
        }
        if (answer == num1.length()+1) {
            answer = -1;
        }

        return answer;
    }
}