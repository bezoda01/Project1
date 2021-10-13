package arrays_List.comparatrs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

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

    }
}
