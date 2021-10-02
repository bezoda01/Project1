package arrays_List;
import java.util.*;

public class forEach {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet();
        list.add("b");
        list.add("v");
        list.add("g");

        for (String str: list)//аналог цикла for(int i = 0;...) - это в своем роде синтаксический сахар
        {
            System.out.print(str + " ");
        }
    }
}
