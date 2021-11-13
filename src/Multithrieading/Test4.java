package Multithrieading;

import java.util.concurrent.TimeUnit;

public class Test4 {
    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> {
            Thread current = Thread.currentThread();
            while (!current.isInterrupted()) {
                try {
                    Thread.sleep(100);
                    System.out.print("*");

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        };
        Thread thread = new Thread(task);
        thread.start();
        TimeUnit.SECONDS.sleep(60);
    }
}
