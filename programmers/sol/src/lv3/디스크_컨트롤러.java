package lv3;

import java.util.*;

public class 디스크_컨트롤러 {
    public int solution(int[][] jobs) {
        int answer = 0;
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;
        while(count < jobs.length) {
            while(index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }
            if(pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0];
                end += cur[1];
                count++;
            }
        }
        return total / jobs.length;
    }
    /**
     * 1. 받은 2D 배열을 요청 시간의 오름차순으로 정렬한다.
     * 2. 우선순위큐를 소요시간의 오름차순으로 정렬되도록 커스터마이징 한다.
     * 3. 현재 작업중인 job의 소요시간을 end로 잡고 end안에 요청이 들어오는 job들만 우선순위큐로 넣는다.
     *    end 전에 요청을 하는 job이 없고 우선순위큐가 비어 있다면 하나를 넣는다.
     * 4. 매 턴 마다 우선순위 큐에서 작업을 하나씩 빼서 수행할 때마다 end를 업데이트한다.
     * 5. 모든 작업이 완료되면 평균을 구한다.
     */
}
