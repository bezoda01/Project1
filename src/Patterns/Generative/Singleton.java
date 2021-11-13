package Patterns.Generative;
//Для чего нужен паттерн Singleton?
//1.когда в вашей программе должно быть создано не более одного объекта какого-либо класса.
//2.когда требуется предоставить глобальную точку доступа к объекту класса.
public class Singleton {
    private static Singleton instance;
    private Singleton(){
    }
    public static Singleton getInstance(){
        if(instance == null){ //если объект ещё не создан
            instance = new Singleton();//создать новый объект
        }
        return instance;//вернуть объект
    }
}
class Main{
    public static void main(String[] args) {
        Singleton.getInstance();
    }
}
