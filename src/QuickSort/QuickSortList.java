package QuickSort;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.util.ArrayList;
import java.util.Collections;

public class QuickSortList {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        Collections.addAll(a, 1, 4, 7);
        Collections.addAll(b, 6, 5, 9);

        /*long start = System.nanoTime();
        mergeList(a, b);
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(a);*/



        long start = System.nanoTime();
        mergeMas(a, b);
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(a);
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long heapMemUsed = memoryBean.getHeapMemoryUsage().getUsed();
        long otherMemUsed = memoryBean.getNonHeapMemoryUsage().getUsed();
        long totalMemoryUsed = heapMemUsed + otherMemUsed;
        System.out.println(totalMemoryUsed);

    }

    public static void mergeList(ArrayList<Integer> A, ArrayList<Integer> B) {
        A.addAll(B);

        quicksortList(A, 0, A.size() - 1);
    }
    public static void quicksortList(ArrayList<Integer> list, int low, int high){

        if(list.size() == 0){
            return;//завершить выполнение, если длина массива = 0
        }
        if(low >= high) {
            return;//Завершить выполнение если уже нечего делить
        }

        //Выбор опорного элемента
        int middle = low + (high - low) / 2;
        int opora = list.get(middle);

        //разделить на массивы, которые больше и меньше опорного элемента - opora
        int i = low;
        int j = high;
        while(i <= j){
            while(list.get(i) < opora){
                i++;
            }

            while(list.get(j) > opora)
            {
                j--;
            }

            if(i <= j){
                int temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j , temp);
                i++;
                j--;
            }
        }

        //Заново вызываем сортировки для левой и правой части
        if(low < j){
            quicksortList(list, low, j);
        }
        if(high > i){
            quicksortList(list, i, high);
        }
    }

    public static void mergeMas(ArrayList<Integer> A, ArrayList<Integer> B){
        A.addAll(B);

        quicksortMas(A);
    }
    public static void quicksortMas(ArrayList<Integer> list){
        int j;
        boolean flag = true;
        int temp;

        while ( flag )
        {
            flag= false;
            for( j=0;  j < list.size() - 1;  j++ )
            {
                if ( list.get(j) > list.get(j+1) )
                {
                    temp = list.get(j);
                    list.set(j, list.get(j+1));
                    list.set(j + 1, temp);
                    flag = true;
                }
            }
        }
    }
}
