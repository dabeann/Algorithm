package sol.baekjoon.baaarKingDog.oxo6;

import java.util.*;

public class 카드2_2164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i);
        }
        while (queue.size() != 1) {
            queue.poll();
            int n = queue.poll();
            queue.offer(n);
        }
        System.out.println(queue.peek());
    }
}
