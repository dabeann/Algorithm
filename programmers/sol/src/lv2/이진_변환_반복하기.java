package lv2;

public class 이진_변환_반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        while (!s.equals("1")) {
            String removedZeros = s.replaceAll("0", "");
            int removedZerosCount = s.length() - removedZeros.length();
            s = Integer.toBinaryString(removedZeros.length());
            answer[0]++;
            answer[1] += removedZerosCount;
        }
        return answer;
    }
}
