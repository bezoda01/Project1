package Classes_and_Object;

public class Class_and_Konstruktor {//это мы создали класс.
    public static final int UNKNOWN = -1;
    public int age;
    public String name;

    public Class_and_Konstruktor(){//это конструктор нашего класса без вводимых параметров.
        this.age = UNKNOWN;
        this.name = "Безымянный";
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public Class_and_Konstruktor(String name, int age){//это конструктор нашего класса с вводом параметров.
        this.name = name;
        this.age = age;
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }

    public static void main(String[] args) {
        Class_and_Konstruktor class_and_konstruktor = new Class_and_Konstruktor("Bob", 21);
        //это мы создали объект нашего класса который вызовет наш конструктор с определенными параметрами.
        Class_and_Konstruktor class_and_konstruktor1 = new Class_and_Konstruktor();
        //создали второй объект нашего класса без вводимых параметров, каждый новый объект класса должен иметь разное имя.
    }
}
