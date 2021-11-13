package Multithrieading;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Test5 {
    public static volatile boolean isWinnerFound = false;
    ArrayList<Car> Cars = new ArrayList<>();
    ArrayList<Thread> threads = new ArrayList<>();


    public static void main(String[] args) {
        Test5 test = new Test5();
        Car aventadorJ = new Car("Lamborghini Aventador J", 3.2, 349, 1000.0);
        Car avendatorLP700 = new Car("Lamborghini Aventador LP 750 SuperVeloce", 2.8, 350, 1000.0);
        Car Jigul = new Car("Jiguli", 9.4, 130, 1000);
        Collections.addAll(test.Cars, aventadorJ, avendatorLP700, Jigul);
        Collections.addAll(test.threads, new Thread(aventadorJ), new Thread(avendatorLP700), new Thread(Jigul));
        for (Thread thread: test.threads) {
            thread.start();
        }
    }
}

class Car implements Runnable, Engine, Info, Ride {

    public void setStartEngine(boolean startEngine) {
        isStartEngine = startEngine;
    }

    public boolean isStartEngine() {
        return isStartEngine;
    }

    private boolean isStartEngine = false;
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

    public Car(String name, double acceleration, double maxSpeed, double distance) {
        this.name = name;
        this.acceleration = acceleration;
        this.maxSpeed = maxSpeed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getAcceleration() {
        return acceleration;
    }

    @Override
    public void run() {
        startEngine();
        getInfo();
        getStart();
        ride();
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        startEngine();
    }

    @Override
    public void startEngine() {
        if (isStartEngine()) {
            setStartEngine(false);
            System.out.println("Двигатель " + getName() + " выключен!");
        } else {
            setStartEngine(true);
            System.out.println("Двигатель " + getName() + " запустился!");
        }
    }

    @Override
    public void getInfo() {
        if (isStartEngine()) {
            System.out.println("Машина " + getName() + " готова к старту!");
        } else {
            System.out.println("Машина " + getName() + "  не готова к старту!");
        }

    }

    public void getStart() {
        if (isStartEngine()) {
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

    @Override
    public void ride() {
        double path = 0.0;
        double percent = 0.0;
        speed = 100 / getAcceleration();
        while (true) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

            path += speed / 3.6;
            percent = path / getDistance() * 100;
            System.out.println(getName() + " прошел - " + percent + "%");

            if (speed < getMaxSpeed()) {
                speed += speed * 0.3;
            }
            if (path >= getDistance() && !Test5.isWinnerFound) {
                Test5.isWinnerFound = true;
                System.out.println(getName() + " победитель!");
                break;
            } else if (Test5.isWinnerFound) {
                System.out.println(getName() + " проиграл!");
                break;
            }
        }
    }
}


interface Engine {
    void startEngine();
}

interface Info {
    void getInfo();
}

interface Ride {
    void ride();
}



