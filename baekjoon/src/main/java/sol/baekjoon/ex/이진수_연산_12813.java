package sol.baekjoon.ex;

import java.io.IOException;
import java.util.Scanner;

public class 이진수_연산_12813 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[100001];
        int[] b = new int[100001];
        String t = sc.nextLine();
        String tt = sc.nextLine();
        for(int i=0;i<t.length();i++) {
            a[i] = t.charAt(i)-'0';
            b[i] = tt.charAt(i)-'0';
        }
        StringBuilder sb = new StringBuilder();
        // A&B
        for(int i=0;i<t.length();i++)
            sb.append(a[i]&b[i]);
        sb.append("\n");
        // A|B
        for(int i=0;i<t.length();i++)
            sb.append(a[i]|b[i]);
        sb.append("\n");
        // A^B
        for(int i=0;i<t.length();i++)
            sb.append(a[i]^b[i]);
        sb.append("\n");
        // ~A
        for(int i=0;i<t.length();i++)
            sb.append(a[i]^1);
        sb.append("\n");
        // ~B
        for(int i=0;i<t.length();i++)
            sb.append(b[i]^1);
        sb.append("\n");
        System.out.println(sb);
    }
}

