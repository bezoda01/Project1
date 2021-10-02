import java.util.Arrays;

public class Task6 {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] timing = Arrays.copyOfRange(array,0,array.length);
        Arrays.sort(timing);
        int get = -1;
        get = Arrays.binarySearch(timing,element);
        System.out.println(get >= 0? "true":"false");
    }
}
