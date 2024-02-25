package sol.baekjoon.baaarKingDog.oxo5;

import java.util.Scanner;
import java.util.Stack;

public class 오큰수_17298 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int N = in.nextInt();
        int[] seq = new int[N];

        for(int i = 0; i < N; i++) {
            seq[i] = in.nextInt();
        }
        for(int i = 0; i < N; i++) {
            while(!stack.isEmpty() && seq[stack.peek()] < seq[i]) {
                seq[stack.pop()] = seq[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()) {
            seq[stack.pop()] = -1;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append(seq[i]).append(' ');
        }
        System.out.println(sb);
    }
}
