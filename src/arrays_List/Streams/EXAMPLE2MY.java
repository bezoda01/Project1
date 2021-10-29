package arrays_List.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class EXAMPLE2MY
{
    public static List<String> list = new ArrayList<>();
    public static final String NULL = "Тут ноль";

    public static void main(String[] args)
    {
        Collections.addAll(list, "Bob", "Cat", null, "Red");
        printAll(list);
    }
    public static void printAll(List list)
    {
        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(NULL)));
    }
}
