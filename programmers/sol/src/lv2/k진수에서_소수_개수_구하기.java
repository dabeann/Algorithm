package lv2;

import java.util.*;

public class k진수에서_소수_개수_구하기 {
    public int solution(int n, int k) {
        int answer = 0;

        String[] ints = Long.toString(n, k).split("0+", -1);

        for (String i : ints) {
            if (!i.isEmpty() && checkPrime(Long.parseLong(i))) answer++;
        }

        return answer;
    }

    public boolean checkPrime(long a) {
        if (a < 2) return false;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) return false;
        }
        return true;
    }
}
