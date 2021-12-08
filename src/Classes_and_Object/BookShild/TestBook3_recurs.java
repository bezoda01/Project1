package Classes_and_Object.BookShild;
//пример рекурсии
//В языке Java поддерживается рекурсия - процесс определения чего-либо относительно самого себя.
public class TestBook3_recurs {
    public static void main(String[] args) {
        Test1 fac = new Test1();

        System.out.println("Факториал числа 4 = " + fac.fact(4));
    }
}
class Test1 {
    int fact(int n) {
        int result;
        if(n == 1) {
            return 1;
        } else {
            result = fact(n - 1) * n;//это и есть рекурсия
            return result;
        }
    }
}
