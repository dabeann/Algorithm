package sol.baekjoon.baaarKingDog.oxo5;

import java.util.*;

public class 제로_10773 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int a = scanner.nextInt();
            if (a == 0){
                stack.pop();
            } else {
                stack.push(a);
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        System.out.println(result);
    }
}
