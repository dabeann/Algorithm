package sol.baekjoon.ex;

import java.util.*;

public class DFS와BFS_1260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 정점의 개수
        int M = scanner.nextInt(); // 간선의 개수
        int V = scanner.nextInt(); // 탐색을 시작할 정점의 번호
        Queue<Integer> queue = new LinkedList<>();

        int[][] arr = new int[N + 1][N + 1];
        int[] visited = new int[N + 1];
        for (int i = 0; i < M; i++) {
            int node1 = scanner.nextInt();
            int node2 = scanner.nextInt();
            arr[node1][node2] = arr[node2][node1] = 1;
        }

        dfs(arr, V, N, visited);
        visited = new int[N + 1];
        System.out.println("");
        bfs(arr, V, N, visited, queue);
    }
    public static void dfs(int[][] arr, int startNode, int N, int[] visited) {
        visited[startNode] = 1;
        System.out.print(startNode + " ");
        for (int i = 0; i <= N; i++) {
            if (visited[i] != 1 && arr[startNode][i] == 1) {
                dfs(arr, i, N, visited);
            }
        }
    }
    public static void bfs(int[][] arr, int startNode, int N, int[] visited, Queue<Integer> q) {
        visited[startNode] = 1;
        q.add(startNode);

        while (!q.isEmpty()) {
            startNode = q.poll();
            System.out.print(startNode + " ");

            for (int i = 1; i <= N; i++) {
                if (arr[startNode][i] == 1 && visited[i] != 1) {
                    q.add(i);
                    visited[i] = 1;
                }
            }
        }
    }
}
