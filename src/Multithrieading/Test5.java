package Multithrieading;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

public class Test5 {
    public static volatile boolean isWinnerFound = false;
    ArrayList<Car> Cars = new ArrayList<>();


    public static void main(String[] args) {
        Test5 test = new Test5();
        Car aventadorJ = new Car("Lamborghini Aventador J", 3.2, 349, 1000);
        Car avendatorLP700 = new Car("Lamborghini Aventador LP 750 SuperVeloce", 2.8, 350, 1000);
        Car Jigul = new Car("Jiguli", 9.4, 130, 1000);
        Collections.addAll(test.Cars, aventadorJ, avendatorLP700, Jigul);
        Thread thread1 = new Thread(aventadorJ);
        Thread thread2 = new Thread(avendatorLP700);
        Thread thread3 = new Thread(Jigul);

        getStart();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public static void getStart() {
        try {
            System.out.println("На старт!");
            Thread.sleep(1000);
            System.out.println("Внимание!");
            Thread.sleep(1000);
            System.out.println("Марш!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class Car implements Runnable, Ride {

    private String name;
    private double acceleration;
    double speed = 0.0;

    public double getMaxSpeed() {
        return maxSpeed;
    }

    private double maxSpeed;

    public double getDistance() {
        return distance;
    }

    private double distance;

    public String getName() {
        return name;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public Car(String name, double acceleration, double maxSpeed, double distance) {
        this.name = name;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.distance = distance;
    }

    @Override
    synchronized public void run() {
        ride();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void ride() {
        double path = 0.0;
        double percent = 0.0;
        speed = 100 / getAcceleration();
        while (true) {
            if (path >= getDistance() && !Test5.isWinnerFound) {
                Test5.isWinnerFound = true;
                System.out.println(getName() + " победитель! ");
                break;
            } else if (Test5.isWinnerFound && path >= getDistance()) {
                System.out.println(getName() + " проиграл! ");
                break;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

            path += speed / 3.6;
            percent = path / getDistance() * 100;
            System.out.println(getName() + " прошел - " + (int) percent + "%");

            if (speed < getMaxSpeed()) {
                speed += speed * 0.3;
            }

        }
    }
}


interface Ride {
    void ride();
}



