import java.util.Arrays;

public class Task5 extends MyMethod{

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    public static void main(String[] args) {
        //Arrays.sort(имя массива)
        //сортирует выбранный массив по возрастанию
        System.out.println(Arrays.toString(array));
        sorting(array);
        System.out.println(Arrays.toString(array));
    }
}
