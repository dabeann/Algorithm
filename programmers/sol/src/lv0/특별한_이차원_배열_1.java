package lv0;

class 특별한_이차원_배열_1 {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for(int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                if(j==i) answer[i][j]=1;
                else answer[i][j]=0;
            }
        }

        return answer;
    }
}