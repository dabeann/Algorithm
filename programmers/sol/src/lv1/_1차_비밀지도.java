package lv1;

public class _1차_비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            int combined = arr1[i] | arr2[i];

            answer[i] = Integer.toBinaryString(combined)
                    .replace('1', '#')
                    .replace('0', ' ');

            while (answer[i].length() < n) {
                answer[i] = " " + answer[i];
            }
        }
        return answer;
    }
}
