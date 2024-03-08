package lv2;

public class N진수_게임 {
    public String solution(int n, int t, int m, int p) {
        String answer = "";

        int i = 0;
        String bi = Integer.toString(i, n); // n진수
        for (int j = 0; j < t * m; j++) {
            answer += bi.charAt(0);
            bi = bi.substring(1);
            if (bi.equals("")){
                bi = Integer.toString(++i, n);
            }
        }
        answer = answer.toUpperCase();
        String a = "";
        for (int j = p-1; j < answer.length(); j+=m) {
            a += answer.charAt(j);
        }

        return a;
    }
}
