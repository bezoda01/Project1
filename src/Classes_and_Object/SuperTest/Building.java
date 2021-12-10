package Classes_and_Object.SuperTest;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

class Name {
    public String getName() {
        return name;
    }

    private String name;

    Name() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя вашего работника:");
        while (true) {
            String name = scanner.nextLine();
            if (!name.equals("")) {
                this.name = name;
                break;
            } else {
                System.out.println("Введите имя!");
            }
        }
    }

    Name(Name b) {
        name = b.name;
    }

}

class Age extends Name {
    public int getAge() {
        return age;
    }

    private int age;

    final int RETIREMENT_AGE = 65;

    Age() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст:");
        while (true) {
            int age = scanner.nextInt();
            if (age > 17 && age < 65) {
                this.age = age;
                break;
            } else {
                System.out.println("Ошибка!" + "\n" + "Введите корректный возраст!");
            }
        }

    }

    Age(Age a) {
        super(a);
        age = a.age;
    }

    void leftUntilRetirement() {
        int difference = RETIREMENT_AGE - getAge();
        System.out.println("До пенсии осталось " + difference + " лет.");
    }
}

class Worker extends Age {
    static final String FILE = "/Users/zenapoznak/Desktop/Worker";

    public String getJob() {
        return job;
    }

    private String job;

    Worker() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите должность работника:");
        while (true) {
            String job = scanner.nextLine();
            if (!job.equals("")) {
                this.job = job;
                writeInFile();
                break;
            } else {
                System.out.println("Введите должность работника!");
            }
        }

    }


    Worker(Worker w) throws IOException {
        super(w);
        job = w.job;
        writeInFile();
    }

    public String getInfo() {
        System.out.println("\n" + "Работник:" + "\n" + "Имя: " + getName() + "\n" + "Возраст: " + getAge() + "\n" + "Должность: " + getJob());
        return "\n" + "Работник:" + "\n" + "Имя: " + getName() + "\n" + "Возраст: " + getAge() + "\n" + "Должность: " + getJob();
    }

    public void writeInFile() throws IOException {
        Path file = Files.createFile(Paths.get(FILE + "/" + getName() + ".txt"));
        try (PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter(String.valueOf(file))))) {
            print.println(getInfo());
        }
    }

    public static void getInfoFiles() {
        File list = new File(FILE);
        System.out.println("Список созданных файлов:" + "\n" + Arrays.toString(list.list()));
    }

    public static void getFiles() throws IOException {
        String name;
        System.out.println("Введите имя файла который хотите прочитать.");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            name = scanner.nextLine();
            File file = new File(FILE + "/" + name + ".txt");
            if (file.isFile()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    System.out.println("Прочитано из файла");
                    while (reader.ready()) {
                        String line = reader.readLine();
                        System.out.println(line);
                    }
                    break;
                }
            } else {
                System.out.println("Введите имя существующего файла. (имя работника)");
            }
        }
    }

    public static void runProgramm() throws IOException {
        Scanner scanner = new Scanner(System.in);
        label:
        while (true) {
            System.out.println("Введите что хотите сделать. (число)");
            System.out.println("""
                    1.Вывести в консоль список файлов о ваших работниках.
                    2.Выбрать файл который вы хотите прочитать.
                    3.Создать файл работника.
                    4.Закрыть программу.""");
            String number = scanner.nextLine();
            switch (number) {
                case "1":
                    getInfoFiles();
                    break;
                case "2":
                    getFiles();
                    break;
                case "3":
                    Worker worker = new Worker();
                case "4":
                    System.out.println("Программа закрыта.");
                    break label;
                default:
                    System.out.println("Введите корректную цифру!");
                    break;
            }
        }
    }


    public static void main(String[] args) throws IOException {
        runProgramm();
    }
}
//Пример вывода в консоль
//Работник:
//Имя: Len
//Возраст: 22
//Должность: Programmer
//До пенсии осталось 43 лет.
//Список созданных файлов:
