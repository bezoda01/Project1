package Classes_and_Object;

public class Classes2 {
    private int age;
    private String name;

    public Classes2(int age, String name){
        this.age = age < 0 ? 0 : age;
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age < 0 ? 0 : age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
