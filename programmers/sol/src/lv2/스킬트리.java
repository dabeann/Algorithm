package lv2;

import java.util.*;

public class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        // skill: 선행 스킬 순서
        char[] skill_char = skill.toCharArray();
        for (String skill_tree : skill_trees) {
            int index = 0;
            int b = 0;
            for (char c : skill_tree.toCharArray()) {
                if (skill.contains(String.valueOf(c)) && c == skill_char[index]){
                    index++;
                } else if (skill.contains(String.valueOf(c)) && c != skill_char[index]) {
                    b = 1;
                    break;
                }
            }
            if (b == 0) answer++;
        }

        return answer;
    }
}
