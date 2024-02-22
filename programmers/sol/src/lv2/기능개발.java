package lv2;

import java.util.*;

public class 기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i = 0; i < progresses.length; i++) {
            int r = (int) Math.ceil((double) (100 - progresses[i])/speeds[i]);
            queue.offer(r);
        }
        while (!queue.isEmpty()) {
            int cnt = 1;
            int current = queue.poll();
            while (!queue.isEmpty() && current >= queue.peek()) {
                queue.poll();
                cnt++;
            }
            answer.add(cnt);
        }
        int[] a = new int[answer.size()];
        for (int i = 0; i < answer.size(); i++) {
            a[i] = answer.get(i);
        }

        return a;
    }
}
