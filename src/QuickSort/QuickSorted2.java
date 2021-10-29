package QuickSort;

import java.util.Arrays;

public class QuickSorted2 {
    public static void quicksort(int[] mas, int low, int high){

        if(mas.length == 0){
            return;//завершить выполнение, если длина массива = 0
        }
        if(low >= high) {
            return;//Завершить выполнение если уже нечего делить
        }

        //Выбор опорного элемента
        int middle = low +(high - low) / 2;
        int opora = mas[middle];

        //разделить на массивы, которые больше и меньше опорного элемента - opora
        int i = low;
        int j = high;
        while(i <= j){
            while(mas[i] < opora){
                i++;
            }

            while(mas[j] > opora)
            {
                j--;
            }

            if(i <= j){
                int temp = mas[i];
                mas[i] = mas[j];
                mas[j] = temp;
                i++;
                j--;
            }
        }

        //Заново вызываем сортировки для левой и правой части
        if(low < j){
            quicksort(mas, low, j);
        }
        if(high > i){
            quicksort(mas, i, high);
        }
    }

    public static void main(String[] args) {
        int[] mas = {5, 3, 7, 2, 4, 8, 10, 1, 6, 9};
        System.out.println("Past:   " + Arrays.toString(mas));


        quicksort(mas, 0, mas.length - 1);
        System.out.println("Future: " + Arrays.toString(mas));

        /*int[] masTwo = new int[1000];
        for(int i = 0; i < masTwo.length; i++){
            masTwo[i] = (int) (Math.random() * 1000);
        }
        System.out.println(Arrays.toString(masTwo));
        quicksort(masTwo, 0, masTwo.length - 1);
        System.out.println(Arrays.toString(masTwo));*/
    }

}
