package lv0;

class 커피_심부름 {
    public int solution(String[] order) {
        int answer = 0;

        for (String str : order){
            if (str.contains("americano")) answer += 4500;
            else if (str.contains("cafelatte")) answer += 5000;
            else if (str.equals("anything")) answer +=4500;
        }

        return answer;
    }
}