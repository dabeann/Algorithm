package sol.baekjoon.baaarKingDog.oxo7;

import java.util.*;
import java.io.*;

public class 최솟값_찾기_11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int N = Integer.parseInt(stringTokenizer.nextToken());
        int L = Integer.parseInt(stringTokenizer.nextToken());
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        Deque<Node> deque = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(stringTokenizer.nextToken());

            while (!deque.isEmpty() && deque.getLast().value > num) {
                deque.removeLast();
            }
            deque.addLast(new Node(num, i));
            if (deque.getFirst().index <= i - L) {
                deque.removeFirst();
            }
            bufferedWriter.write(deque.getFirst().value + " ");
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }
    static class Node {
        public int value;
        public int index;
        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}
