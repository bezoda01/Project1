import java.util.Arrays;

public class Task4 {

    public static int[][] result = new int[2][];
    public static int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

    public static void main(String[] args) {
        //имя двумерного массива[ячейка] = Arrays.copyOfRange(имя массива,от какой ячейки,до какой ячейки)
        //копирует из одного массива в другой в определенном диапазоне
        int back = array.length % 2 == 0 ? array.length / 2:array.length / 2 + 1;
        result[0] = Arrays.copyOfRange(array,0, back);
        result[1] = Arrays.copyOfRange(array, back, array.length);
        System.out.println(Arrays.deepToString(result));
    }
}
