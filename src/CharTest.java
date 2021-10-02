import java.util.Arrays;
import java.util.Scanner;

public class CharTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String pat = console.nextLine();

        char[] chars = pat.toCharArray();//переводит строку в массив символов

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '/') {
                chars[i] = '\\';
            }
            System.out.println(Arrays.toString(chars));
        }

        String result = new String(chars);//переводит массив символо chars обратно в строку
        System.out.println(result);
        String path = console.nextLine();
        //имя строки.endsWith(строка)
        //проверяет заканчивается ли введенная строку на запрашиваемую строку
        if (path.endsWith(".jpg") || path.endsWith(".jpeg"))
        {
            System.out.println("Это Jpeg!");
        }
        else if (path.endsWith(".htm") || path.endsWith(".html"))
        {
            System.out.println("Это HTML-страница");
        }
        else if (path.endsWith(".doc") || path.endsWith(".docx"))
        {
            System.out.println("Это документ Word");
        }
        else
        {
            System.out.println("Неизвестный формат");
        }
    }
}
