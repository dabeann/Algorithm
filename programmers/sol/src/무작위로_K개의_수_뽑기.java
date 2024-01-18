import java.util.ArrayList;
import java.util.List;

class 무작위로_K개의_수_뽑기 {
    public int[] solution(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();

        for (int a : arr) {
            if (!answer.contains(a) && answer.size()<k){
                answer.add(a);
            }
        }
        for (int i = answer.size(); i < k; i++) {
            answer.add(-1);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}