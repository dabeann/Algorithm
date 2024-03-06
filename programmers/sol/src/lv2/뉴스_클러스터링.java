package lv2;

import java.util.*;

public class 뉴스_클러스터링 {
    public int solution(String str1, String str2) {
        int answer = 0;

        List<String> arr1 = getArr(str1);
        List<String> arr2 = getArr(str2);

        answer = calculate(arr1,arr2);

        return answer;
    }

    public List<String> getArr(String str){
        List<String> res = new ArrayList<>();
        for(int i = 0; i < str.length()-1;i++){
            String value = "" + str.charAt(i) + str.charAt(i+1);

            if(value.matches("^[a-zA-Z]*$")){
                res.add(value.toLowerCase());
            }
        }
        return res;
    }

    public int calculate(List<String> arr1, List<String> arr2){
        List<String> c = new ArrayList<>();
        List<String> u = new ArrayList<>();
        // 합집합 : A + B - A n B
        // 교집합
        for(String value : arr1){
            if(arr2.contains(value)){
                c.add(value);
                arr2.remove(value);
            }
            u.add(value);
        }

        for(String value : arr2){
            u.add(value);
        }
        int cNum = c.size();
        int uNum = u.size();

        if(u.size() == 0){
            return 65536;
        }
        return (int)((double)cNum / uNum * 65536);
    }
}
