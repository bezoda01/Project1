package arrays_List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class hashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
        //коллекция множества, нельзя узнать размер, объекты не имеют индексов и мы их не можем получить методом get
        //set тоже не работает

        set.add("Привет");
        set.add("Hello");
        set.add("Hola");
        set.add("Bonjour");
        set.add("Cialo");
        set.add("Namaste");

        //что бы вывести всю коллекцию множество нужно ввести следующее
        //Итератор — это специальный объект у коллекции, который помогает обойти все элементы коллекции и не повторяться.
        //Iterator<Тип> it = имя.iterator();
        //Где имя — это имя переменной-коллекции, Тип — это тип элементов коллекции. iterator() — это метод коллекции. it — это имя переменной-объекта-итератора.
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            //пока есть ячейки будет продолжаться цикл
            String sc = it.next();
            System.out.print(sc + " ");
        }
        removeList(set);

        printHashSet(set);
    }

    public static void removeList(HashSet<String> list){//метод по удалению объекта в коллекции множества
        //сделали копию коллекции множества и из этой копии запустили for each
        ArrayList<String> copy = new ArrayList<>(list);
        for(String str: copy){
            if(str.equals("Hola")){
                list.remove(str);
            }
        }
    }

    public static void printHashSet(HashSet<String> list){
        System.out.println();
        for(String str: list){
            System.out.print(str + " ");
        }
    }
}
