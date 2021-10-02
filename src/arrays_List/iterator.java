package arrays_List;

import java.util.HashSet;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        HashSet<Integer> iNt = new HashSet<Integer>();
        for(int i = 0;i <= 10;i++){
            iNt.add(i);
        }
        //создали коллекцию множества и проинициализировали её
        Iterator<Integer> it = iNt.iterator();
        while(it.hasNext()){
            int a = it.next();
            if(a == 5){
                it.remove();
            }
            System.out.print(a + " ");
        //создали итератор для удаления объекта из коллекции множества(если бы у нас объкты были типа String то было бы if(a.eqals("строка")))
        }
    }
}
