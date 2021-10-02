package arrays_List;

import java.util.ArrayList;

public class replace_list {
    public static ArrayList<Integer> numbers = new ArrayList<Integer>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for(int i = 0; i < 10; i++)
        {
            numbers.add(i);
        }
    }

    public static void reverse() {
        int n = numbers.size() - 1;
        for (int i = 0; i < numbers.size() / 2; i++) {
            int temp = numbers.get(i);
            numbers.set(i, numbers.get(n - i));
            numbers.set(n - i, temp);
        }
    }

    private static void print() {
        System.out.println();
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
