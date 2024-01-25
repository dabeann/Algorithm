package lv0;

class _7의_개수 {
    public int solution(int[] array) {
        int answer = 0;

        for (int a : array) {
            String st = String.valueOf(a);
            for (char b : st.toCharArray()) {
                if (b=='7') answer++;
            }
        }

        return answer;
    }
}