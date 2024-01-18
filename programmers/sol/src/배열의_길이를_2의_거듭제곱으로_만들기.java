import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 배열의_길이를_2의_거듭제곱으로_만들기 {
    public int[] solution(int[] arr) {
        List<Integer> answer = Arrays.stream(arr).boxed().collect(Collectors.toList());

        while (!powerOfTwo(answer.size())) {
            answer.add(0);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean powerOfTwo(int num) {
        int i = 0;
        while (i < num) {
            if(Math.pow(2,i) == num) return true;
            i++;
        }
        return false;
    }
}