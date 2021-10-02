import java.util.Arrays;

public class mass_null_var_JV {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }
//есть массив который нужно отсортировать так что бы все null значения были в конце значения
    // далее идет метод для решения задачи
    public static void executeDefragmentation(String[] array) {
        String[] temp = new String[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                temp[j] = array[i];
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }
    }
}

