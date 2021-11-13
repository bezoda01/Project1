package Multithrieading;

public class ExampleWatch {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            Thread.sleep(1000);
            System.out.println("Tik");
        }
    }
}
