package Dates.oldCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Data_calendar {
    Calendar calendar = new GregorianCalendar(2021, 9, 06);
    Date date = calendar.getTime();
    SimpleDateFormat formatte = new SimpleDateFormat("YYYY.MMMMM.dd");
    String dateToDay = formatte.format(date);
    int years = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int day = calendar.get(Calendar.DAY_OF_MONTH);

    public Data_calendar(String string)
    {
        System.out.println(string + dateToDay);
    }

    public Data_calendar(String yearS, String monthS, String dayS)
    {
        System.out.println(yearS + years + monthS + month + dayS + day);
    }

    public static void main(String[] args) {
        Data_calendar dataCalendar = new Data_calendar("Сегодня ");
        Data_calendar dataCalendar1 = new Data_calendar("Год ", " месяц ",  " день ");
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
    }
}
