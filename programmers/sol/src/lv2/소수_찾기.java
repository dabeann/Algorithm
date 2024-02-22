package lv2;

import java.util.*;

public class 소수_찾기 {
    private Set<Integer> set = new HashSet<>();

    public int solution(String numbers) {
        char[] chars = numbers.toCharArray();
        boolean[] visited = new boolean[chars.length];

        // 가능한 모든 순열 생성
        for (int r = 1; r <= chars.length; r++) {
            permutation(chars, visited, 0, r, "");
        }

        // 소수 개수 세기
        int answer = 0;
        for (int num : set) {
            if (isPrime(num)) {
                answer++;
            }
        }

        return answer;
    }

    // 순열 생성 함수
    private void permutation(char[] chars, boolean[] visited, int depth, int r, String current) {
        if (depth == r) {
            set.add(Integer.parseInt(current));
            return;
        }

        for (int i = 0; i < chars.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                permutation(chars, visited, depth + 1, r, current + chars[i]);
                visited[i] = false;
            }
        }
    }

    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
