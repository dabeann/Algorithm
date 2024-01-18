import java.util.Arrays;

class 배열_비교하기 {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;

        if (arr1.length > arr2.length) {
            answer = 1;
        } else if (arr1.length < arr2.length) {
            answer = -1;
        } else {
            if (Arrays.stream(arr1).sum()>Arrays.stream(arr2).sum()) {
                answer = 1;
            } else if (Arrays.stream(arr1).sum() < Arrays.stream(arr2).sum()) {
                answer = -1;
            } else{
                answer = 0;
            }

        }

        return answer;
    }
}