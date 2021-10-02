import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Try_Catch {
    public static final String EXIT = "exit";
    static Scanner scanner = new Scanner(System.in);
    private static String number;

    public static List<String> studentsJournal = Arrays.asList(
            "Тимур Мясной"
            , "Пенелопа Сиволап"
            , "Орест Злобин"
            , "Ирида Продувалова"
            , "Гектор Гадюкин"
            , "Электра Чемоданова"
            , "Гвидон Недумов"
            , "Роксана Борисенко"
            , "Юлиан Мумбриков"
            , "Зигфрид Горемыкин");

    public static String getNumber() {
        return number;
    }
    public static void setNumber(String number) {
        Try_Catch.number = number;
    }

    public static void main(String[] args) {
        Try_Catch try_catch = new Try_Catch();
        doThis();
    }

    public static void doThis(){//у нас есть метод, который просит ввести в консоль число и выводит под этим индексом объект
        // но допустим мы ввели число < 0, будет ошибка ArrayIndexOutOfBoundsException
        // введем не целое число, а double будет ошибка NumberFormatException
        while(true) {
            System.out.println("Введите число / для выхода введите exit");
            setNumber(scanner.nextLine());
            if(getNumber().toLowerCase().equals(EXIT)){
                System.out.println("Программа завершена.");
                break;
            }

            int intNumber;
            try {
                intNumber = Integer.parseInt(getNumber());
                System.out.println(studentsJournal.get(intNumber));//ошибка случилась здесь
            }catch (ArrayIndexOutOfBoundsException dev1){
                System.out.println("Такого числа в списке нету, его размер равен " + studentsJournal.size());
            }catch (NumberFormatException dev2){
                System.out.println("Введите целое число");
            }
        }
    }
}
