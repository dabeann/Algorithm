package lv1;

class 바탕화면_정리 {
    public int[] solution(String[] wallpaper) {
        int[] answer = new int[4];

        int lux = wallpaper.length;
        int luy = wallpaper[0].length();
        int rdx = 0;
        int rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].substring(j, j+1).equals("#")){
                    if (i<lux) lux = i;
                    if (j<luy) luy = j;
                    if (i>rdx) rdx = i;
                    if (j>rdy) rdy = j;
                }
            }
        }

        rdx++;
        rdy++;
        answer[0] = lux;
        answer[1] = luy;
        answer[2] = rdx;
        answer[3] = rdy;
        return answer;
    }
}