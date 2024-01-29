package lv1;

import java.util.*;

class 추억_점수 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        List<Integer> list = new ArrayList<>();

        HashMap<String,Integer> map = new HashMap<>();
        for ( int i=0; i<name.length; i++){
            map.put(name[i], yearning[i]);
        }

        // 각 사진의 추억 점수 계산
        int[] result = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int totalYearning = 0;

            for (int j = 0; j < photo[i].length; j++) {
                String person = photo[i][j];

                if (map.containsKey(person)) {
                    totalYearning += map.get(person);
                }
            }

            result[i] = totalYearning;
        }

        return result;
    }
}