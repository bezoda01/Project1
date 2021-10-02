import java.util.Arrays;
import java.util.Random;

public class MyMethod {
    public static void main(String[] args) {
        Random rand = new Random();
        int n = rand.nextInt(20);
        System.out.println("Длинна массива = " + n);
        int[] mas = new int[n];
        for(int i = 0;i < mas.length;i++){
            mas[i] = rand.nextInt(100);
        }
        System.out.println("До сортировки - " + Arrays.toString(mas));
        sorting(mas);
        System.out.println("После сортировки - " + Arrays.toString(mas));
    }
    public static int[] sorting(int[] mas){
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    int tmp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = tmp;
                    needIteration = true;
                }
            }
        }
        return mas;
    }
}
