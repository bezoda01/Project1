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
    final String FILE = "/Users/zenapoznak/Desktop/Worker";

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

    public void getInfoFiles() {
        File list = new File(FILE);
        System.out.println("Список созданных файлов:" + "\n" + Arrays.toString(list.list()));
    }



    public static void main(String[] args) throws IOException {
        Worker worker = new Worker();
        worker.leftUntilRetirement();
        worker.getInfoFiles();
    }
}
//Пример вывода в консоль
//Работник:
//Имя: Len
//Возраст: 22
//Должность: Programmer
//До пенсии осталось 43 лет.
//Список созданных файлов:
