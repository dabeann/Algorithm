package lv1;

public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        int amount = 0;
        for (char a : s.toCharArray()) {
            if (a == 'p' || a == 'P') amount++;
            else if (a == 'y' || a == 'Y') amount--;
        }
        if (amount == 0) return true;
        else return false;
    }
}
