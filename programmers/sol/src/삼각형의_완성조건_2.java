class Solution {
    public int solution(int[] sides) {
        int answer = 0;

        if (sides[0] > sides[1]) {
            int temp = sides[0];
            sides[0] = sides[1];
            sides[1] = temp;
        }
        // sides[0]에 작은 값, sides[1]에 큰 값 넣음

        // sides[1]이 세 변 중 가장 긴 변일 때
        for (int i = 1; i < sides[1]; i++) {
            if (sides[1] < sides[0] + i) {
                answer++;
            }
        }

        // 새로운 값이 세 변 중 가장 긴 변일 때
        for (int i = sides[1]; i < sides[0]+sides[1]; i++) {
            if (i < sides[0] + sides[1]) {
                answer++;
            }
        }

        return answer;
    }
}