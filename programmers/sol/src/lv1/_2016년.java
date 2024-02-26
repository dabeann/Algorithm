package lv1;

import java.time.LocalDate;

public class _2016년 {
    private String[] week = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

    public String solution(int month, int day) {
        LocalDate date = LocalDate.of(2016, month, day);
        int dayOfWeek = date.getDayOfWeek().ordinal();
        return week[dayOfWeek];
    }
}
