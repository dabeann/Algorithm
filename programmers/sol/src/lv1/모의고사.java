package lv1;

import java.util.ArrayList;

public class 모의고사 {
    public int[] solution(int[] answers) {
        int[] answer = {};

        int[] m1 = {1, 2, 3, 4, 5};
        int[] m2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] m3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;

        int m11 = 0;
        int m22 = 0;
        int m33 = 0;

        for (int a : answers) {
            if (a == m1[index1++]) m11++;
            if (index1 == m1.length) index1 = 0;
            if (a == m2[index2++]) m22++;
            if (index2 == m2.length) index2 = 0;
            if (a == m3[index3++]) m33++;
            if (index3 == m3.length) index3 = 0;
        }

        int maxScore = Math.max(m11, Math.max(m22, m33));

        ArrayList<Integer> resultList = new ArrayList<>();
        if (maxScore == m11) resultList.add(1);
        if (maxScore == m22) resultList.add(2);
        if (maxScore == m33) resultList.add(3);

        answer = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            answer[i] = resultList.get(i);
        }

        return answer;
    }
}
