package lv1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class 실패율 {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];

        // 스테이지별 실패율을 저장할 Map 생성
        Map<Integer, Double> failureRateMap = new HashMap<>();

        // 스테이지별 도전 중인 사용자 수 저장
        int[] challenges = new int[N + 2];
        for (int stage : stages) {
            challenges[stage]++;
        }

        // 스테이지별 실패율 계산 및 Map에 저장
        int totalPlayers = stages.length;
        for (int i = 1; i <= N; i++) {
            if (totalPlayers == 0) {
                failureRateMap.put(i, 0.0);
            } else {
                failureRateMap.put(i, (double) challenges[i] / totalPlayers);
                totalPlayers -= challenges[i];
            }
        }

        // 실패율을 기준으로 내림차순으로 정렬
        List<Entry<Integer, Double>> entries = new ArrayList<>(failureRateMap.entrySet());
        entries.sort((e1, e2) -> Double.compare(e2.getValue(), e1.getValue()));

        // 정렬된 스테이지 번호를 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = entries.get(i).getKey();
        }

        return answer;
    }
}
