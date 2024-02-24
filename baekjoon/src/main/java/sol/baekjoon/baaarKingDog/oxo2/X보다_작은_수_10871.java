package sol.baekjoon.baaarKingDog.oxo2;

import java.util.*;

public class X보다_작은_수_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int[] A = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (A[i] < x) {
                System.out.print(A[i] + " ");
            }
        }
    }
}
