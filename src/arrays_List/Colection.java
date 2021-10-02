package arrays_List;

import java.util.*;

public class Colection {
    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<Integer> firstList = new ArrayList<>();
    public static ArrayList<Integer> secondList = new ArrayList<>();

    public int getFrequency() {
        return frequency;
    }
    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    private int frequency;

    private static String name;

    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }

    private int min = 0;

    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        this.max = max;
    }

    private int max = 0;

    public static String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Colection colection = new Colection();
        add(list);
        fill();
        nCopies();
        colection.replaceAll(list);
        copyAndRevers(firstList, secondList);
        shuffle(firstList);
        printList(list);
        colection.minAndMaxInt(firstList);
        colection.frequency(firstList);
        binary(firstList);
    }

    public static void printList(ArrayList<String> firstList){
        for(String numbersFirstList: firstList){
            System.out.print(numbersFirstList + " ");
        }
        System.out.println();
    }

    public static void add(ArrayList<String> list){
       Collections.addAll(list, "Bob", "Jack", "Mike", "Frank", "Tom");
       for(String name: list){
           System.out.print(name + " ");
       }
        System.out.println();
    }

    public static void fill(){
        ArrayList<Integer> numberTen = new ArrayList<>();
        int i = 0;
        while(true){
            i++;
            numberTen.add(i);
            if(i == 10){
                break;
            }
        }
        Collections.fill(numberTen, 10);
        for(int number: numberTen){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void nCopies(){
        String name = "Bob";
        List<String> fake = Collections.nCopies(6, name);
        ArrayList<String> lists = new ArrayList<String>(fake);
        for(String names: lists){
            System.out.print(names + " ");
        }
        System.out.println();
    }

    public ArrayList<String> replaceAll(ArrayList<String> list){
        Scanner sc = new Scanner(System.in);
        setName(sc.nextLine());
        Collections.replaceAll(list, "Mike", getName());
        for(String name: list){
            System.out.print(name + " ");
        }
        System.out.println();
        return list;
    }

    public static ArrayList<Integer> copyAndRevers(ArrayList<Integer> firstList, ArrayList<Integer> secondList){
        int i = 0;
        while(true){
            i++;
            firstList.add(i);
            secondList.add(i+5);
            if(i == 10){
                break;
            }
        }
        if(firstList.size() >= secondList.size()){
            Collections.copy(firstList, secondList);
        }
        for(int numbersFirstList: firstList){
            System.out.print(numbersFirstList + " ");
        }
        System.out.println("После копирования.");

        Collections.reverse(firstList);
        for(int numbersFirstLis: firstList){
            System.out.print(numbersFirstLis + " ");
        }
        System.out.println("После реверса.");

        Collections.sort(firstList);
        for(int numbersFirstListes: firstList){
            System.out.print(numbersFirstListes + " ");
        }
        System.out.println("После сортировки.");

        Collections.rotate(firstList, 5);
        for(int numbersFirstLister: firstList){
            System.out.print(numbersFirstLister + " ");
        }
        System.out.println("После сдвига");

        return firstList;
    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> firstList){
        Collections.shuffle(firstList);
        for(int numbersFirstList: firstList){
            System.out.print(numbersFirstList + " ");
        }
        System.out.println("После перемешки.");
        return firstList;
    }

    public void minAndMaxInt(ArrayList<Integer> firstList){
        setMin(Collections.min(firstList));
        setMax(Collections.max(firstList));
        System.out.println(getMin() + " минимальное число из firstList коллекции.");
        System.out.println(getMax() + " максимальное число из firstList коллекции.");
    }

    public void frequency(ArrayList<Integer> firstList){
        setFrequency(Collections.frequency(firstList, getMax()));
        System.out.println(getFrequency() + " столько раз встречается объект " + getMax() + " в коллекции  firstList.");
    }

    public static void binary(ArrayList<Integer> firstList){
        Collections.sort(firstList);
        int indexOfObject = Collections.binarySearch(firstList, 10);
        System.out.println(indexOfObject + " индекс объекта 10 в коллекции firstList.");
    }
}
