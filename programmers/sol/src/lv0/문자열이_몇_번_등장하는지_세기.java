package lv0;

class 문자열이_몇_번_등장하는지_세기 {
    public int solution(String myString, String pat) {
        int answer = 0;

        for(int i = myString.length()-1; i>=0; i--){
            String subStr = myString.substring(0, i+1);
            if(subStr.endsWith(pat)){
                answer++;
            }
        }

        return answer;
    }
}