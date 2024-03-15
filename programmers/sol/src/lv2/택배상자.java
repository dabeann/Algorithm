package lv2;

import java.util.*;

public class 택배상자 {
    public int solution(int[] order) {
        int answer = 0;
        int cur = 0;
        Stack<Integer> stack = new Stack<>();
        int i = 1;

        while (cur < order.length) {
            if (!stack.isEmpty() && stack.peek() == order[cur]) {
                cur++;
                answer++;
                stack.pop();
            } else {
                stack.push(i++);
                if (i > order.length + 1) break;
            }
        }

        return answer;
    }
}
