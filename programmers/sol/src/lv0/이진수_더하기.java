package lv0;

class 이진수_더하기 {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        int res = num1+num2;
        answer = Integer.toBinaryString(res);
        return answer;
    }
}