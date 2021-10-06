package Dates.newCalendar;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class newData {
    LocalDate today = LocalDate.now();//создаем обьект с сегодняшней датой
    LocalDate myBirthday = LocalDate.of(2000,9,7);//создали обьект с нашей указанной датой

    public newData()//Конструктор выводит две одинаковых дат,первая только цифры, вторая день и месяц словами на русском
    {
        System.out.println("Сейчас - " + today);
        System.out.println("Сейчас - "
                    + today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru")) +
                " " + today.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ru")) +
                " " + today.getYear());
    }
    public static void main(String[] args) {

        newData newData = new newData();//вывели конструктор
    }
}
