package arrays_List.array_method;

import java.util.Arrays;

public class ClassInfo {
    public static void main(String[] args){
        CustomStringArrayList arrayList = new CustomStringArrayList();
        for(int i = 0; i <= 30; i++) {
            arrayList.add("count" + i);
        }
        System.out.println(Arrays.toString(arrayList.elements));
    }
}
