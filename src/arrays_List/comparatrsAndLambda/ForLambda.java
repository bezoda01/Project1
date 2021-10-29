package arrays_List.comparatrsAndLambda;

import java.util.ArrayList;
import java.util.Collections;

public class ForLambda
{
    public static void main(String[] args)
    {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "Bob", "Mark", "Frank", "Charli");

        Collections.sort(list, (String o1, String o2) -> o2.length() - o1.length());
        list.forEach((s) -> System.out.print(s + " "));//короткая запись for
        list.forEach(System.out::println);//самая короткая запись
    }

}
