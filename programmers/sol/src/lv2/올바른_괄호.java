package lv2;

import java.util.Stack;

public class 올바른_괄호 {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else if (stack.isEmpty()) {
                return false; // 스택이 비어있으면 false 반환
            } else {
                stack.pop();
            }
        }

        return stack.isEmpty(); // 스택이 비어있으면 올바른 괄호
    }
}
