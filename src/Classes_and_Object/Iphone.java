package Classes_and_Object;

public class Iphone {//это наш класс с приватными полями
    private String model;
    private String color;
    private int price;

    public Iphone(String model, String color, int price) {//это конструктор нашего класса с инициализацие переменных
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public boolean equals(Object obj){
        //создали новый класс equals из за того что мы хотим сравнить два обьекта с одинаковыми полями и что бы было true
        //а обычный equals сравнивает только ссылки
        if(this == obj){//сравниваем ссылки
            return true;
        }
        if(obj == null){
            //если бы у нас было бы типичное сравнивание ссылок и при том что в обьекте null то оно могло бы -
            //выдать что они одинаковые , по этому мы еще делаем проверку на null
            return false;
        }
        if ( !getClass().equals(obj.getClass()) ) {//проверка что сравниваемые обьекты из одного класса
            //если нет то возвращает false
            return false;
        }

        Iphone iphone = (Iphone) obj;//приводим один обьект к другому что бы сравнить уже их внутренности

        return this.model == iphone.model && this.color == iphone.color && this.price == iphone.price;

    }

    public static void main(String[] args) {
        Iphone iphone1 = new Iphone("X", "Black", 999);
        Iphone iphone2 = new Iphone("X", "Black", 999);

        System.out.println(iphone1.equals(iphone2));
    }

}
