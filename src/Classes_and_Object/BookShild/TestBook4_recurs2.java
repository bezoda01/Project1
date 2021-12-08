package Classes_and_Object.BookShild;

public class TestBook4_recurs2 {
    public static void main(String[] args) throws InterruptedException {
        Test2 ob = new Test2(100);
        int i;

        for(i = 0; i < 100;i++) {
            ob.values[i] = i;
        }

        ob.printArray(100);
    }
}

class Test2 {
    int values[];

    Test2(int i) {
        values = new int[i];
    }

    void printArray(int i) throws InterruptedException {
        if (i == 0) {
            return;
        } else {
            printArray(i - 1);//рекурсия
            Thread.sleep(100);
            System.out.println("[" + (i - 1) + "] " + values[i - 1]) ;
        }
    }
}