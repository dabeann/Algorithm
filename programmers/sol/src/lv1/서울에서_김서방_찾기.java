package lv1;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        String answer = "";

        int index = 0;
        for (String s : seoul) {
            if (s.equals("Kim")){
                answer = "김서방은 " + index + "에 있다";
            }
            index++;
        }

        return answer;
    }
}
