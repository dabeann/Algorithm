package sol.baekjoon.baaarKingDog.oxo8;

import java.util.*;

public class 좋은_단어_3986 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int answer = 0;

        scanner.nextLine();

        for (int i = 0; i < N; i++) {
            String s = scanner.nextLine();
            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if (stack.peek() == c) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            if (stack.isEmpty()) answer++;
        }
        System.out.println(answer);
    }

}
