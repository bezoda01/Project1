import java.util.Arrays;

public class mass_null_my_var {
    public static void main(String[] args) {
        String[] memory = {"object15", null, null, "object2", null, null, null, "object32", null, "object4"};
        executeDefragmentation(memory);
        System.out.println(Arrays.toString(memory));
    }

    public static void executeDefragmentation(String[] array) {
        String delimiter = " ";
        String result = String.join(delimiter, array);

        String[] newString = result.split(" ");
        boolean back = true;
        while(back){
            back = false;
            for(int i = 0;i < newString.length - 1;i++){
                if(newString[i].equals("null") && !newString[i+1].equals("null")){
                    String temp = newString[i];
                    newString[i] = newString[i+1];
                    newString[i+1] = temp;
                    back = true;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = newString[i];
        }
    }
}
