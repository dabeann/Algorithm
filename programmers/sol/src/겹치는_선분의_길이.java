class 겹치는_선분의_길이 {
    public int solution(int[][] lines) {
        int answer = 0;

        int[] arr = new int[200];
        for (int[] a : lines) {
            for (int i = a[0]; i < a[1]; i++) {
                arr[i+100]++;
            }
        }
        for (int a : arr) {
            if (a > 1) {
                answer++;
            }
        }

        return answer;
    }
}