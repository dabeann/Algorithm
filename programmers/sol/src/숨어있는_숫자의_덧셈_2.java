class 숨어있는_숫자의_덧셈_2 {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[a-zA-Z]", " ").split(" ");
        for (String a : str) {
            if (!a.equals("")) {
                answer += Integer.parseInt(a);
            }
        }


        return answer;
    }
}