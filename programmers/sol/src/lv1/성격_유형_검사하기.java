package lv1;

import java.util.HashMap;

public class 성격_유형_검사하기 {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        int[] score = {0, 0, 0, 0, 0, 0, 0, 0}; // R, T // C, F // J, M // A, N
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('T', 1);
        map.put('C', 2);
        map.put('F', 3);
        map.put('J', 4);
        map.put('M', 5);
        map.put('A', 6);
        map.put('N', 7);

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] == 1) {
                score[map.get(survey[i].charAt(0))]+=3; // 전자 +3
            } else if (choices[i] == 2) {
                score[map.get(survey[i].charAt(0))]+=2;
            } else if (choices[i] == 3) {
                score[map.get(survey[i].charAt(0))]+=1;
            } else if (choices[i] == 5) {
                score[map.get(survey[i].charAt(1))]+=1;
            } else if (choices[i] == 6) {
                score[map.get(survey[i].charAt(1))]+=2;
            } else if (choices[i] == 7) {
                score[map.get(survey[i].charAt(1))]+=3;
            }
        }
        for (int i = 0; i < 8; i+=2) {
            if (score[i] >= score[i + 1]) {
                if (i==0) answer+='R';
                else if (i == 2) answer+='C';
                else if (i == 4) answer += 'J';
                else if (i == 6) answer += 'A';
            } else {
                if (i==0) answer+='T';
                else if (i == 2) answer+='F';
                else if (i == 4) answer += 'M';
                else if (i == 6) answer += 'N';
            }
        }

        return answer;
    }
}
