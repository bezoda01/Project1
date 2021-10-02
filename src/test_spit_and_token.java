import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class test_spit_and_token {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//создаем строку с помощью консоли
        System.out.println(Arrays.toString(spliting(str)));
        //выводим массив с помощью класса Arrays.toString(метод(массив));
        tokeniz(str);
    }
    public static String[] spliting(String str){
        String[] splitet = str.split(" ");
        //создали массив строк, после чего вводим:строка.split(строка, которая разделит массив на ячейки);
        return splitet;
    }

    public static void tokeniz(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str, "n");
        //можно создать конструктор StringTokenizer который принимает строку и "делитель строки"
        //после чего можно создать цикл - while, и поставить условием:имя.hasMoreToken()
        //hasMoreToken() - цикл будет проверять есть ли еще token(это делитель строки) в строке
            while(tokenizer.hasMoreTokens()){
                String token = tokenizer.nextToken();
                //пока token есть в строке будет создавать String со строкой до делителя
                System.out.println(token);
        }
    }
}

