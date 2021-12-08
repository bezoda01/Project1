package Classes_and_Object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TestMy extends People{
    TestMy(String name, int age) throws IOException {
        super(name, age);
    }

    public static void main(String[] ags) throws IOException {
        createPeoples(people);

    }
}

class People {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    private String name;
    private int age;

    static ArrayList<People> people = new ArrayList<>();

    People(String name, int age) throws IOException {
        this.name = name;
        this.age = age;

        System.out.println("Человек с именем " + name + " создан, ему " + age + " лет.");
    }

    static void createPeoples(ArrayList<People> peoples) throws IOException {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                System.out.println("Хотите создать человека?" + "\n" + "Y/N");
                String answer = scanner.readLine();
                if (answer.equals("Y")) {
                    System.out.println("Введите имя человека:");
                    String name = scanner.readLine();
                    System.out.println("Введите возраст человека:");
                    int age = scanner.read();
                    People people = new People(name, age);
                    peoples.add(people);
                } else {
                    break;
                }
            }
        }
    }
}