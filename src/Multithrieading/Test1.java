package Multithrieading;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        Printer printer1 = new Printer("HP m102");//создаем объект класса который содержит метод run
        Thread firstPrinter = new Thread(printer1);//создаем объект класса Thread и передали ему объект нашего класса

        Printer printer2 = new Printer("Epsone L1020");
        Thread secondPrinter = new Thread(printer2);
        
        secondPrinter.start();
        firstPrinter.start();// через метод start() запускаем новую нить
        System.out.println(firstPrinter.getState());
        firstPrinter.join();
        if(firstPrinter.getState().equals(Thread.State.TERMINATED)){
            System.out.println(printer1.getName() + " остановлен!");
        }
    }
}
class Printer implements Runnable{//класс который реализует интерфейс Runnable

    public String getName() {
        return name;
    }

    private String name;

    public Printer(String name){
        this.name = name;

    }    @Override
    public void run() {// метод который будет запускаться
        System.out.println("Принтер " + this.name + " работает!");
        try {
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
