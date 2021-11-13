package Multithrieading;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Phone phone = new Phone();
        Thread Iphone = new Thread(phone);
        Iphone.start();
        Thread.sleep(10000);
        Iphone.interrupt();
    }
}
class Phone implements Runnable{

    @Override
    public void run() {
        Thread current = Thread.currentThread();//создали переменную на подобии boolean
        while (!current.isInterrupted()){// цикл пока переменная current не вызовет метод interrupt
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                current.interrupt();
            }
            System.out.println("Brrrring");
        }
    }
}
