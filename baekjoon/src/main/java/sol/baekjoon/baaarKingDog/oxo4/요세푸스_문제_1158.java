package sol.baekjoon.baaarKingDog.oxo4;

import java.util.*;

public class 요세푸스_문제_1158 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            list.add(i);
        }
        StringBuilder result = new StringBuilder("<");
        int idx = 0;

        while (!list.isEmpty()) {
            idx = (idx + K - 1) % list.size();
            result.append(list.remove(idx)).append(", ");
        }

        result.delete(result.length() - 2, result.length()).append(">");
        System.out.println(result.toString());
    }
}
