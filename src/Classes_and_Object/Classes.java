package Classes_and_Object;

public class Classes {//наш главный класс из которого мы вызываем остальные классы
    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();//создали обьект класса в котором мы наследовали первый класс
        //одним лишь обьектом и наследованием одного класса в другой мы вывели строки и выполнили логирование
    }
    public static String print(String text){//метод для вывода в консоль строк
        System.out.println(text);
        return text;
    }
}
//мы хотим создать два класса, и узнать что от чего наследуется, для этого сделали метод вывода строк
class ParentClass{//создали новый класс
    public String a = Classes.print("Classes_and_Object.ParentClass.a");
    //создали переменную типа String и вызвали из класса Classes_and_Object.Classes метод print, и передали строку с названием нашего класса и имя переменной.
    public String b = Classes.print("Classes_and_Object.ParentClass.b");
    //проделали тоже самое

    public ParentClass(){
        Classes.print("Classes_and_Object.ParentClass.constructor");
        //создали конструктор и вызвали из класса Classes_and_Object.Classes метод print, и передали туда названием класса и то что это конструктор
    }
}

class ChildClass extends ParentClass{//создали новый класс и проделали то же самое что и в прошлом классе только другие имена строк
    //что бы вызвать из класса Classes_and_Object.Classes два наших класса одним лишь созданием объекта мы наследуем первый класс во второй
    public String c = Classes.print("Classes_and_Object.ChildClass.c");
    public String d = Classes.print("Classes_and_Object.ChildClass.d");

    public ChildClass(){
        Classes.print("Classes_and_Object.ChildClass.constructor");
    }

}

