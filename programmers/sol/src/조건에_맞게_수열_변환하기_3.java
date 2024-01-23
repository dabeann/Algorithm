class 조건에_맞게_수열_변환하기_3 {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[arr.length];

        int index = 0;
        if(k%2==1){
            for (int a: arr){
                answer[index++] = a*k;
            }
        }
        else {
            for (int a:arr){
                answer[index++] = a+k;
            }
        }


        return answer;
    }
}