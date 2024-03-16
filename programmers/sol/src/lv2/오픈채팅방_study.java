package lv2;

import java.util.*;

public class 오픈채팅방_study {
    public String[] solution(String[] record) {
        List<String> answerList = new ArrayList<>();
        Map<String, String> nameMap = new HashMap<>(); // 아이디, 이름

        for (String r : record) {
            String[] s = r.split(" ");
            if (!s[0].equals("Leave")) {
                nameMap.put(s[1], s[2]);
            }
        }

        for (String r : record) {
            StringBuilder result = new StringBuilder();
            String[] s = r.split(" ");

            if (s[0].equals("Enter")) {
                result.append(nameMap.get(s[1])).append("님이 들어왔습니다.");
                answerList.add(String.valueOf(result));
            } else if (s[0].equals("Leave")) {
                result.append(nameMap.get(s[1])).append("님이 나갔습니다.");
                answerList.add(String.valueOf(result));
            }
        }
        return answerList.toArray(new String[0]);
    }

    public static void main(String[] args) {
        오픈채팅방_study p = new 오픈채팅방_study();
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo",
                "Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] answer = p.solution(record);
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
