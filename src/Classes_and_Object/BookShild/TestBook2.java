package Classes_and_Object.BookShild;
//Объекты в качестве параметров в методах
public class TestBook2 {
    public static void main(String[] args) {
        Test o1 = new Test(2, 3);
        Test o2 = new Test(2, 3);
        Test o3 = new Test(0, 5);

        System.out.println("o1 == o2: " + o1.equalsTo(o2));
        System.out.println("o1 == 03: " + o1.equalsTo(o3));
    }
}
class Test {
    int a, b;
    Test(int i, int j) {
        a = i;
        b = j;
    }

    //возвратить логическое значение t r u e, если в
    //качестве параметра о, указан вызывающий объект
    boolean equalsTo(Test o) {
        if(o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
