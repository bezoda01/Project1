package Dates.newCalendar;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class newTime {

    public static void main(String[] args) throws InterruptedException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("ss");
        String text1 = dtf.format( LocalDateTime.now() );
        System.out.println(text1);

        Thread.sleep(5000);
        String text2 = dtf.format( LocalDateTime.now() );

        int timeDrive = Integer.parseInt(text2) - Integer.parseInt(text1);
    }
}
