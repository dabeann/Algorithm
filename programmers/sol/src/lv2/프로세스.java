package lv2;

import java.util.Collections;
import java.util.PriorityQueue;

public class 프로세스 {
    public int solution(int[] priorities, int location) {
        // 내림차순
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        for (int i : priorities) {
            queue.offer(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < priorities.length; i++) {
                // 현재 작업의 위치 찾기
                if (queue.peek() == priorities[i]) {
                    queue.poll();
                    answer++;

                    // 현재 작업이 location과 같으면 answer 반환
                    if (location == i) {
                        return answer;
                    }
                }
            }
        }
        return answer;
    }
}
