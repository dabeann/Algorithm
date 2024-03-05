package lv2;

import java.util.*;

public class 행렬의_곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int l = arr1.length;
        int m = arr1[0].length;
        int n = arr2[0].length;
        int[][] answer = new int[l][n];

        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < m; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }

        return answer;
    }
}
