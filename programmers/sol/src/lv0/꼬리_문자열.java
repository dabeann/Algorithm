package lv0;

class 꼬리_문자열 {
    public String solution(String[] str_list, String ex) {
        String answer = "";

        for ( String str : str_list){
            if(!str.contains(ex)) answer += str;
        }

        return answer;
    }
}