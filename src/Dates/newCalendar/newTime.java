package Dates.newCalendar;

import java.time.LocalTime;

public class newTime {
    LocalTime timeNow = LocalTime.now();
    public newTime()
    {
        System.out.println(timeNow);
    }

    public static void main(String[] args) {
        newTime newTime = new newTime();
    }
}
