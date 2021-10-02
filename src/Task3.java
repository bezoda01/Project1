import java.util.Arrays;

public class Task3 {

    public static int[] array = new int[19];
    public static int valueStart = 10;
    public static int valueEnd = 13;

    public static void main(String[] args) {
        //Arrays.fill(имя массива,с какой ячейки,до какой ячейки,какими значениями)
        // заполняет массив значениями от ячейки до ячейки
        if(array.length % 2 == 0){
            Arrays.fill(array,0,array.length / 2,valueStart);
            Arrays.fill(array,array.length / 2,array.length,valueEnd);
        }
        else{
            Arrays.fill(array,0,array.length / 2 + 1,valueStart);
            Arrays.fill(array,array.length / 2 + 1,array.length,valueEnd);
        }
        System.out.println(Arrays.toString(array));
    }
}
