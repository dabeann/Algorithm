import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class 배열의_원소_삭제하기 {
    public int[] solution(int[] arr, int[] delete_list) {

        List<Integer> list = new ArrayList<>();
        List<Integer> dlist = Arrays.stream(delete_list).boxed().collect(Collectors.toList());

        for (int a : arr) {
            if (!dlist.contains(a)) {
                list.add(a);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}