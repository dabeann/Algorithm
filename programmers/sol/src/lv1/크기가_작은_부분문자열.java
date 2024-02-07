package lv1;

class 크기가_작은_부분문자열 {
    public int solution(String t, String p) {
        int answer = 0;
        int plength = p.length();

        for (int i = 0; i < t.length()-plength+1; i++) {
            if (Long.parseLong(t.substring(i, i+plength)) <= Long.parseLong(p)) {
                answer++;
            }
        }

        return answer;
    }
}