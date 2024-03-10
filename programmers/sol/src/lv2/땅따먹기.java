package lv2;

public class 땅따먹기 {
    /**
     * dfs: 시간초과
     */
    /*int answer = 0;
    int solution(int[][] land) {

        dfs(land, 0, 0, -1);

        return answer;
    }

    public void dfs(int[][] land, int score, int row, int column) {
        if (row == land.length){
            answer = Math.max(answer, score);
            return;
        }
        for (int i = 0; i < land[row].length; i++) {
            if (i == column) continue;
            dfs(land, score + land[row][i], row + 1, i);
        }
    }*/

    int solution(int[][] land) {
        int answer = 0;

        for (int i = 1; i < land.length; i++) {
            land[i][0] += Math.max(Math.max(land[i - 1][1], land[i - 1][2]), land[i - 1][3]);
            land[i][1] += Math.max(Math.max(land[i - 1][0], land[i - 1][2]), land[i - 1][3]);
            land[i][2] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][3]);
            land[i][3] += Math.max(Math.max(land[i - 1][0], land[i - 1][1]), land[i - 1][2]);
        }
        for (int i = 0; i < 4; i++) {
            answer = Math.max(answer, land[land.length - 1][i]);
        }
        return answer;
    }
}
