package lv0;

class 옹알이_1 {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String str : babbling) {
            String stri = str;
            while (!stri.equals("")) {
                if (stri.startsWith("aya")) {
                    stri = stri.substring(3);
                } else if (stri.startsWith("ye")) {
                    stri = stri.substring(2);
                } else if (stri.startsWith("woo")) {
                    stri = stri.substring(3);
                } else if (stri.startsWith("ma")) {
                    stri = stri.substring(2);
                } else {
                    break;
                }
            }
            if (stri.equals("")) {
                answer++;
            }
        }

        return answer;
    }
}
