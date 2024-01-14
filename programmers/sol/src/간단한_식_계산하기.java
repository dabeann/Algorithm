class 간단한_식_계산하기 {
    public int solution(String binomial) {
        int answer = 0;

        String[] st = binomial.split(" ");
        if (st[1].equals("+")) {
            answer = Integer.parseInt(st[0])+Integer.parseInt(st[2]);
        } else if (st[1].equals("-")) {
            answer = Integer.parseInt(st[0]) - Integer.parseInt(st[2]);
        } else {
            answer = Integer.parseInt(st[0]) * Integer.parseInt(st[2]);
        }

        return answer;
    }
}