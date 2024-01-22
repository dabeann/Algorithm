class k의_개수 {
    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {
            for (char a : String.valueOf(l).toCharArray()) {
                if(String.valueOf(a).contains(String.valueOf(k))) answer++;
            }
        }

        return answer;
    }
}