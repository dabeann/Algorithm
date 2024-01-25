package lv0;

class 특별한_이차원_배열_2 {
    public int solution(int[][] arr) {
        int answer = 1;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]!=arr[j][i]) answer = 0;
            }
        }

        return answer;
    }
}