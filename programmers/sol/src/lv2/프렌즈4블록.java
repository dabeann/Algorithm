package lv2;

import java.util.*;

public class 프렌즈4블록 {
    public int solution(int m, int n, String[] board) {
        int answer = 0;

        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            for (int j = m - 1; j >= 0; j--) {
                list.get(i).add(board[j].charAt(i));
            }
        }

        while (true) {
            int count = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = list.get(i).size() - 1; j > 0 ; j--) {
                    check(i, j, list);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = list.get(i).size() - 1; j >= 0; j--) {
                    if (Character.isLowerCase(list.get(i).get(j))) {
                        list.get(i).remove(j);
                        count++;
                    }
                }
            }

            if (count == 0) break;
            else answer += count;
        }

        return answer;
    }

    public void check(int i, int j, ArrayList<ArrayList<Character>> list) {
        if (list.get(i).size() <= 1 || j >= list.get(i + 1).size()) return;

        char up = Character.toUpperCase(list.get(i).get(j));
        char down = Character.toLowerCase(up);

        if ((list.get(i).get(j - 1) == up || list.get(i).get(j - 1) == down) &&
                (list.get(i + 1).get(j) == up || list.get(i + 1).get(j) == down) &&
                (list.get(i + 1).get(j - 1) == up || list.get(i + 1).get(j - 1) == down)) {
            list.get(i).set(j, down);
            list.get(i + 1).set(j, down);
            list.get(i + 1).set(j - 1, down);
            list.get(i).set(j - 1, down);
        }
    }
}
