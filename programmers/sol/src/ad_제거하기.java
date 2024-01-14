import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String a : strArr) {
            if (!a.contains("ad")) {
                list.add(a);
            }
        }

        return list.toArray(new String[list.size()]);
    }
}