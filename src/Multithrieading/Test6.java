package Multithrieading;

import java.util.ArrayList;
import java.util.Collections;

public class Test6 {
    public static void main(String[] args) {
        test();
    }

    private static int counter;
    public static void test() {
        Runnable runnable = new Runnable() {
            @Override
            synchronized public void run() {
                counter = 0;
                for (int i = 0;i < 5;i++) {
                    counter = counter + 1;
                    System.out.println(Thread.currentThread().getName() + ": " + counter);
                }
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

