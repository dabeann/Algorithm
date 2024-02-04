package lv1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class 카드_뭉치 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";

        List<String> cards11 = new ArrayList<>();
        for (String a : cards1) {
            cards11.add(a);
        }
        List<String> cards22 = new ArrayList<>();
        for (String a : cards2) {
            cards22.add(a);
        }
        List<String> goall = new ArrayList<>();
        for (String a : goal) {
            goall.add(a);
        }

        int index1 = 0;
        int index2 = 0;
        Iterator<String> iterator = goall.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (index1 < cards11.size() && str.equals(cards11.get(index1))) {
                index1++;
                iterator.remove();
            } else if (index2 < cards22.size() && str.equals(cards22.get(index2))) {
                index2++;
                iterator.remove();
            }
        }

        goall.removeIf(s -> s == null);
        if (goall.size() == 0) {
            answer = "Yes";
        } else {
            answer = "No";
        }


        return answer;
    }
}
