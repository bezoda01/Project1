package arrays_List.comparatrsAndLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparattr
{
    public static ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args)
    {
        Collections.addAll(list, "Bob", "Franchesko", "Piter", "Mark");
            System.out.println("До сортировки по длине слов: ");

            for(String write : list)
            {
                System.out.print(write + " ");
            }
            System.out.println();
            System.out.println("После сортировки: ");
            Collections.sort(list, new compareString());//что бы отсортировать так как мы хотим создается определенный интерфейс
            for(String write : list)
            {
                System.out.print(write + " ");
            }

            Comparator<String> comparator = (String o1, String o2) ->  //это лямбда выражение
            {
                return o2.length() - o1.length();
            };

            Collections.sort(list, comparator);//но можно без создания отдельного интерфейса!

        System.out.println();
        System.out.println("После обратной сортировки: ");

        for(String write : list)
        {
            System.out.print(write + " ");
        }

        //а можно еще так -
        Collections.sort(list, (String ob1, String ob2) ->
        {
            return ob1.length() - ob2.length();
        }
    );

        System.out.println();
        System.out.println("После обратной сортировки: ");

        for(String write : list)
        {
            System.out.print(write + " ");
        }

        //самый короткий способ записать лямбда выражение -
        Collections.sort(list, (String o1, String o2) -> o2.length() - o1.length());
        //значения выражения - если длинну первого слова отнять от второго будет меньше нуля то первое  слово меньше второго и переставит его вместо второго
        System.out.println();
        System.out.println("После обратной сортировки: ");

        for(String write : list)
        {
            System.out.print(write + " ");
        }

    }
}
