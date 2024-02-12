package lv1;

public class 로또의_최고_순위와_최저_순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = {6, 1};

        int match = 0;
        int zero = 0;
        for (int a : lottos) {
            for (int w : win_nums) {
                if (a == w) {
                    match++;
                }
            }
            if (a == 0) {
                zero++;
            }
        }
        if (match == 6) {
            answer[0] = 1;
            answer[1] = 1;
        } else if (match == 5) {
            if (zero == 1) {
                answer[0] = 1;
                answer[1] = 2;
            } else {
                answer[0] = 2;
                answer[1] = 2;
            }
        } else if (match == 4) {
            if (zero == 1) {
                answer[0] = 2;
                answer[1] = 3;
            } else if (zero == 2) {
                answer[0] = 1;
                answer[1] = 3;
            } else if (zero == 0) {
                answer[0] = 3;
                answer[1] = 3;
            }
        } else if (match == 3) {
            if (zero == 1) {
                answer[0] = 3;
                answer[1] = 4;
            } else if (zero == 2) {
                answer[0] = 2;
                answer[1] = 4;
            } else if (zero == 3) {
                answer[0] = 1;
                answer[1] = 4;
            } else if (zero == 0) {
                answer[0] = 4;
                answer[1] = 4;
            }
        } else if (match == 2) {
            if (zero == 1) {
                answer[0] = 4;
                answer[1] = 5;
            } else if (zero == 2) {
                answer[0] = 3;
                answer[1] = 5;
            } else if (zero == 3) {
                answer[0] = 2;
                answer[1] = 5;
            } else if (zero == 4) {
                answer[0] = 1;
                answer[1] = 5;
            } else if (zero == 0) {
                answer[0] = 5;
                answer[1] = 5;
            }
        } else if (match == 1) {
            if (zero == 1) {
                answer[0] = 5;
                answer[1] = 6;
            } else if (zero == 2) {
                answer[0] = 4;
                answer[1] = 6;
            } else if (zero == 3) {
                answer[0] = 3;
                answer[1] = 6;
            } else if (zero == 4) {
                answer[0] = 2;
                answer[1] = 6;
            } else if (zero == 5) {
                answer[0] = 1;
                answer[1] = 6;
            } else if (zero == 0) {
                answer[0] = 6;
                answer[1] = 6;
            }
        } else if (match == 0) {
            if (zero == 1) {
                answer[0] = 6;
                answer[1] = 6;
            } else if (zero == 2) {
                answer[0] = 5;
                answer[1] = 6;
            } else if (zero == 3) {
                answer[0] = 4;
                answer[1] = 6;
            } else if (zero == 4) {
                answer[0] = 3;
                answer[1] = 6;
            } else if (zero == 5) {
                answer[0] = 2;
                answer[1] = 6;
            } else if (zero == 6) {
                answer[0] = 1;
                answer[1] = 6;
            } else if (zero == 0) {
                answer[0] = 6;
                answer[1] = 6;
            }
        }


        return answer;
    }
}
