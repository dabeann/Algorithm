package lv0;

class 외계어_사전 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int len = spell.length;
        int check = 0;

        for (String str : dic) {
            for (String a : spell) {
                if (str.contains(a)) {
                    check++;
                }
            }

            if (check == len) {
                answer = 1;
                break;
            }
            check = 0;
        }

        return answer;
    }
}