package lv0;

class 부분_문자열 {
    public int solution(String str1, String str2) {
        int answer = 0;

        if(str2.contains(str1)) answer = 1;

        return answer;
    }
}