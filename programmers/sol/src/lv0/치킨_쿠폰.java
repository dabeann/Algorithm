package lv0;

class 치킨_쿠폰 {
    public int solution(int chicken) {
        int coupon = chicken;
        int count = 0;

        while (coupon >= 10) {
            int leftCoupon = coupon % 10;
            count += coupon / 10;
            coupon = leftCoupon + coupon / 10;
        }
        return count;
    }
}