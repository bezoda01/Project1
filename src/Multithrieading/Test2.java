package Multithrieading;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Exampler test = new Exampler();
        Thread threadOne = new Thread(test);
        threadOne.start();
        Thread.sleep(10000);
        test.cancel();//ждет 10 секунд и останавливает нить
    }
}
class Exampler implements Runnable{
    private boolean isCancel = false;// создали приватную переменную boolean

    public void cancel(){//создали метод по инициализации переменной в true
        this.isCancel = true;
    }
    @Override
    public void run() {
        while (!isCancel){//цикл пока переменная не изменится на true
            try {
                Thread.sleep(1000);
                System.out.println("Brrr");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
