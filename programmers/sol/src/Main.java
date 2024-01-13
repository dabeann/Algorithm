import java.util.*;
import java.util.stream.Collectors;

// 알고리즘 문제
class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";

        for (char a : my_string.toCharArray()) {
            if (String.valueOf(a).equals(alp)){
                answer+=String.valueOf(a).toUpperCase();
            }
            else answer+=a;
        }

        return answer;
    }
}


//Main 클래스에서 Solution클래스 선언해주기
public class Main {
    public static void main(String[] ars) {
        Solution s = new Solution();
        //입력요소를 선언해줘야 출력값이 나옴

        //int[] a = {5, 9, 7, 10};
        //s.solution(a, 5);
    }
}