package lv1;

public class 카카오_인턴_키패드_누르기 {
    public String solution(int[] numbers, String hand) {
        // 초기 손 위치
        int leftHand = 10; // '*'의 위치
        int rightHand = 12; // '#'의 위치

        StringBuilder answer = new StringBuilder();

        for (int number : numbers) {
            if (number == 0) {
                number = 11; // 0의 위치는 11로 설정
            }

            // 숫자가 왼쪽 열에 속하는 경우
            if (number % 3 == 1) {
                answer.append("L");
                leftHand = number;
            }
            // 숫자가 오른쪽 열에 속하는 경우
            else if (number % 3 == 0) {
                answer.append("R");
                rightHand = number;
            }
            // 숫자가 가운데 열에 속하는 경우
            else {
                int leftDistance = calculateDistance(leftHand, number);
                int rightDistance = calculateDistance(rightHand, number);

                // 두 손의 거리 비교
                if (leftDistance < rightDistance) {
                    answer.append("L");
                    leftHand = number;
                } else if (leftDistance > rightDistance) {
                    answer.append("R");
                    rightHand = number;
                } else {
                    // 거리가 같은 경우
                    if (hand.equals("left")) {
                        answer.append("L");
                        leftHand = number;
                    } else {
                        answer.append("R");
                        rightHand = number;
                    }
                }
            }
        }
        return answer.toString();
    }

    private int calculateDistance(int hand, int target) {
        int[] handPos = {(hand - 1) / 3, (hand - 1) % 3};
        int[] targetPos = {(target - 1) / 3, (target - 1) % 3};

        return Math.abs(handPos[0] - targetPos[0]) + Math.abs(handPos[1] - targetPos[1]);
    }
}
