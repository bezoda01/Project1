public class Task9 {
    public static void main(String[] args) throws InterruptedException {
        diana();
    }
    public static void diana() throws InterruptedException {
        //Thread.sleep(Колличество милисекунд) - ставит на паузу команду;
        for(int i = 1;i <= 5;i++){
            System.out.println(i);
            if(i < 5){
                Thread.sleep(1000);
            }
        }
    }
}
