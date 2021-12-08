package Classes_and_Object.BookShild;

public class ObjectMethod {
    public static void main(String[] args) throws InterruptedException {
        //объявление объекта типа Box
        Box myBox1 = new Box(10, 20, 15); //выделить память для объекта Вох
        Box cloneBox = new Box(myBox1);//наш клон объекта myBox1

        System.out.println("myBox1: " + myBox1.summary(myBox1));
        System.out.println("cloneBox: " + cloneBox.summary(cloneBox));

    }
}
class Box {
    double width;
    double height;
    double depth;

    Box(double width, double height, double depth) throws InterruptedException {
        System.out.println("Конструирование объекта Box...");
        this.width = width;
        this.height = height;
        this.depth = depth;
        Thread.sleep(2000);
    }
    //Конструктор создающий клона объекта
    Box(Box o) {
        width = o.width;
        height = o.height;
        depth = o.depth;
    }

    double summary(Box o) {
        return o.width + o.depth + o.height;
    }

}
