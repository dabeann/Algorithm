class A로_B만들기 {
    public int solution(String before, String after) {
        int answer = 0;

        for (char a : before.toCharArray()) {
            if (after.contains(String.valueOf(a))) {
                after = after.replaceFirst(String.valueOf(a), "");
            }
        }
        if (after.equals("")) answer=1;

        return answer;
    }
}