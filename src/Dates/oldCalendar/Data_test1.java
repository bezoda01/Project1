package Dates.oldCalendar;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data_test1 {
   private static final Date current = new Date();
   private static final Date birthday = new Date(100, 8, 7);


    public static void main(String[] args) {
        DateBirthday();
    }

    public static void DateBirthday()
    {
        System.out.println(current);
        SimpleDateFormat formatter = new SimpleDateFormat("MMMMMM");
        String birthdayf = formatter.format(birthday);
        System.out.println(birthdayf);
    }
}
