package lv1;

import java.util.*;

public class 같은_숫자는_싫어 {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        for (int a : arr) {
            if (stack.empty()){
                stack.push(a);
            } else if (stack.lastElement() == a) {
                continue;
            } else {
                stack.push(a);
            }
        }

        int[] answer = new int[stack.size()];
        int index = stack.size()-1;
        while (!stack.empty()){
            answer[index--] = stack.pop();
        }
        return answer;
    }
}
