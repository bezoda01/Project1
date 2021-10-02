package arrays_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Day {
    enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        public static List<Days> asList(){
            ArrayList<Days> list = new ArrayList<Days>();

            Collections.addAll(list, values());

            return list;
        }
    }

    public static void main(String[] args) {
        List<Days> list = Days.asList();
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

