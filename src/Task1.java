import java.util.Arrays;

public class Task1 {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        //String имя =  Arrays.toString(имя массива)
        // выводит одномерный массив
        String str = Arrays.toString(strings);
        System.out.println(str);
        String sct = Arrays.toString(ints);
        System.out.println(sct);
    }
}
