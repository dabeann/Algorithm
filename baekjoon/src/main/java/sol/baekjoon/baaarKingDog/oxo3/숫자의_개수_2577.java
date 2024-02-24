package sol.baekjoon.baaarKingDog.oxo3;

import java.util.Scanner;

public class 숫자의_개수_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String total = String.valueOf(a*b*c);
        char[] str = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        int[] ints = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < total.length(); j++) {
                if (total.charAt(j) == str[i]) {
                    ints[i]++;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(ints[i]);
        }
    }
}
