import java.util.ArrayList;
import java.util.List;

class 세_개의_구분자 {
    public String[] solution(String myStr) {
        List<String> answer = new ArrayList<>();

        String str = "";
        int index = 0;
        for (char a : myStr.toCharArray()) {
            if (a == 'a' || a == 'b' || a == 'c') {
                if (!str.equals(""))
                    answer.add(str);
                str = "";
            } else if (index==myStr.length()-1){
                str += a;
                answer.add(str);
            }
            else{
                str += a;
            }
            index++;
        }
        if (answer.size() == 0) {
            answer.add("EMPTY");
        }

        return answer.toArray(new String[0]);
    }
}