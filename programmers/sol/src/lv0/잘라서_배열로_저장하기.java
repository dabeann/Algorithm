package lv0;

class 잘라서_배열로_저장하기{
    public String[] solution(String my_str, int n){
        int cnt = (my_str.length() + n - 1) / n;
        String[] answer = new String[cnt];

        for(int i = 0; i < cnt; i++){
            int start = n * i;
            int end = 0;
            if(start + n >= my_str.length()){
                end = my_str.length();
            } else {
                end = start + n;
            }
            answer[i] = my_str.substring(start, end);
        }
        return answer;
    }
}