package QuickSort;

import java.util.Arrays;

public class QuickSorted
{

    public static void main(String[] args)
    {
        int[] mas = new int[] {3, 7, 12, 54, 2, 0, 45, 16, 65};
        System.out.println("До сортировки" + Arrays.toString(mas));
        quickSort(mas, 0, mas.length -1);
        System.out.println("После сортировки" + Arrays.toString(mas));
    }
    public static void quickSort(int[] mas, int from, int to)
    {
        if(from < to)
        {
            int divideIndex = partition(mas, from, to);

            quickSort(mas, from, divideIndex - 1);

            quickSort(mas, divideIndex, to);
        }
    }

    public static int partition(int[] mas, int from, int to)
    {
        int rightIndex = to;
        int leftIndex = from;

        int pivot = mas[from];

        while(leftIndex <= rightIndex)
        {
            while(mas[leftIndex] < pivot)
            {
                leftIndex++;
            }

            while(mas[rightIndex] > pivot)
            {
                rightIndex--;
            }

            if(leftIndex <= rightIndex)
            {
                swap(mas, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return leftIndex;
    }

    public static void swap(int[] mas, int index1, int index2)
    {
        int temp = mas[index1];
        mas[index1] = mas[index2];
        mas[index2] = temp;

    }
}
