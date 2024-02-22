package lv2;

public class 모음사전 {
    public int solution(String word) {
        int answer = 0;
        int[] weights = {781, 156, 31, 6, 1}; // 각 자리수의 가중치

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            answer += "AEIOU".indexOf(ch) * weights[i] + 1; // 해당 알파벳이 몇 번째인지 계산하여 더함
        }
        return answer;
    }
}
