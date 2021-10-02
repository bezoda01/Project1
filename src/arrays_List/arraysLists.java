package arrays_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraysLists {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();
//два листа
    public static void initEmployees() {//один из наших методов по добавлению строк в лист
        //что бы добавить элемент в лист нужно написать - имя листа.add(строка);

        String name = "";
        String stop = "stop";
        System.out.println("Please, write your workers:");
        System.out.println("Than, please input - stop.");
        while(true){
            name = sc.nextLine();
            if(name.equals(stop)){
                break;
            }
            else{
                waitingEmployees.add(name);
            }
        }
        System.out.println("Your workers which didn't take their salary.");
        for(int i = 0; i < waitingEmployees.size();i++){
            System.out.print(waitingEmployees.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        initEmployees();
        paySalary();
        getInfo();
    }

    public static void paySalary() {
        System.out.println(" ");
        System.out.println("Your workers didn't take their salary, let's input their name and give out their salary.");
        String name = "";
        String stop = "stop";
        while(true){
            name = sc.nextLine();
            if(name.equals(stop)){
                break;
            }
            else if(!waitingEmployees.contains(name)){
                System.out.println("This worker is not on the list, please try again.");
            }
            else if(waitingEmployees.contains(name)){
                System.out.println(name + "has got a salary.");
                alreadyGotSalaryEmployees.add(name);
            }


        }//метод по определению строки в другом листе ,его замены и удалению из первоначального листа
    }
        /*if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {//contains - содержит ли лист следующую строку
            alreadyGotSalaryEmployees.add(name);//добавление в лист
            for (int i = 0; i < waitingEmployees.size(); i++) {//создали цикл для того что бы определить индекс нашей строки
                if (waitingEmployees.get(i).equals(name)) {//get - возвращает индекс элемента
                    waitingEmployees.set(i, null);//set(индекс, строка) - метод по замене строки , передаем индекс и нашу строку
                    break;
                }
            }
        }
    }
   */

    public static void getInfo() {
        System.out.println("Workers which got their salary");
        for(int i = 0;i < alreadyGotSalaryEmployees.size();i++){
            System.out.println(alreadyGotSalaryEmployees.get(i) + " ");
        }
        System.out.println("Workers which didn't get their salary");
        for (int j = 0;j < waitingEmployees.size();j++){
            System.out.println(waitingEmployees.get(j) + " ");
        }
    }
}
