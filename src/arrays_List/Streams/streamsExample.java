package arrays_List.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class streamsExample
{
    public static List<Integer> list = new ArrayList<>();

    public static void main(String[] args)
    {
        Stream.of(1,2,3,4,5,6)
                .filter(x -> x > 2)
                .forEach(System.out::println);
    }
}
