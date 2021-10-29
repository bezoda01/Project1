package arrays_List.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Example2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");
//у нас есть список слов среди которых есть значение null
//что бы при выводе на экран не выскочила ошибка нужно это как то обойти
//для этого есть класс Optional с его методом orElse - если встречается null то он его заменяет на конкретную строку
        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        list.forEach(s -> System.out.println(Optional.ofNullable(s).orElse(text)));
//вспомощью stream создаем forEach(s) s - переменная которая значит обьект в списке, если он встречается то выводится именно то что мы хотим
    }
}
