package lv1;

import java.util.HashSet;

public class 폰켓몬 {
    public int solution(int[] nums) {
        int a = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
            if (set.size() == a) {
                break;
            }
        }
        return set.size();
    }
}
