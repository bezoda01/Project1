import java.util.concurrent.TimeUnit;

public class Task10 {
    public static void main(String[] args) throws InterruptedException {
        printd();
    }
    public static void printd() throws InterruptedException {
        //TimeUnit.SECONDS.sleep(Колличество секунд) - ставит на паузу команду
        for(int i = 1;i <= 5;i++){
            System.out.println(i);
            if(i < 5){
                TimeUnit.SECONDS.sleep(2);
            }
        }
    }
}
