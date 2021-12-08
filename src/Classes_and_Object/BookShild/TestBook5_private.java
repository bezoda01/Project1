package Classes_and_Object.BookShild;

public class TestBook5_private {
    public static void main(String[] args) {
        Test3 test = new Test3();
        test.setC(5);
        System.out.println(test.getC());
    }
}
class Test3 {
    private int c;

    void setC(int c) {//сеттер - метод по инициализации переменной с приватным доступом
        this.c = c;
    }
    int getC() {//геттер - метод по возвращению числа, например вывести его в консоль
        return c;
    }
}