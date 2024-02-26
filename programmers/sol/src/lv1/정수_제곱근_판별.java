package lv1;

public class 정수_제곱근_판별 {
    public long solution(long n) {
        if (Math.floor(Math.sqrt(n)) == Math.sqrt(n)){
            return (long) ((Math.sqrt(n)+1)*(Math.sqrt(n)+1));
        }
        return -1;
    }
}
