package lv0;

import java.util.Arrays;

class 최댓값_만들기_2 {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int res1 = numbers[0] * numbers[1];
        int res2 = numbers[numbers.length - 1] * numbers[numbers.length - 2];

        return res1 > res2 ? res1 : res2;
    }
}