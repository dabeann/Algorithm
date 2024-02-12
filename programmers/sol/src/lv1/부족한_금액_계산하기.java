package lv1;

public class 부족한_금액_계산하기 {
    public long solution(int price, int money, int count) {
        long totalCost = (long)price * count * (count + 1) / 2;
        long shortage = totalCost - money;
        return Math.max(0, shortage);
    }
}
