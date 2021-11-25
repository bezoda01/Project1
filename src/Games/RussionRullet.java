package Games;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RussionRullet {
    public static ArrayList<Integer> baraban = new ArrayList<>() {{
        add(0);
        add(0);
        add(1);
        add(0);
        add(0);
        add(0);
    }};

    public static void main(String[] args) throws IOException, InterruptedException {
        game();
    }

    public static int getRandom() {
        return (int) (Math.random() * 6);
    }

    public static void game() throws IOException, InterruptedException {
        System.out.println("Русская рулетка");
        sleep(2);
        System.out.println("Правила:");
        System.out.println("Если вы выстрелили 10 раз и выжили, то победили");
        sleep(2);
        System.out.println("Начинаем");
        startToShoot();
    }

    public static void startToShoot() throws IOException, InterruptedException {
        try (BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in))) {
            int count = 0;
            while (true) {
                if (count == 10) {
                    System.out.println("Вы победили!");
                    break;
                }
                System.out.println("Введите 1 что бы спустить курок!");
                String ask = scanner.readLine();
                if (ask.equals("1")) {
                    if (baraban.get(getRandom()).equals(0)) {
                        System.out.println("Осечка.");
                        System.out.println("Продолжаем.");
                        count++;
                    } else {
                        System.out.println("Вы мертвы.");
                        System.out.println("Количество попыток - " + count);
                        break;
                    }
                } else {
                    System.out.println("Все мы люди, ну ничего, в следующий раз продолжим.");
                    break;
                }
            }
        }
    }

    public static void sleep(int second) throws InterruptedException {
        Thread.sleep(second * 1000L);
    }
}
