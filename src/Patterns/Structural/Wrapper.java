package Patterns.Structural;

public class Wrapper {
    public static void main(String[] args) {
        Phone phone = new Phone("Iphone 12 pro max");
        PhoneWrapper phoneWrapper = new PhoneWrapper(phone);
        printName(phoneWrapper);
    }
    public static void printName(Phone named) {
        System.out.println(named.getName());
    }
}

class Phone {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone(String name) {
        this.name = name;
    }
}

class PhoneWrapper extends Phone {
    private Phone original;

    public PhoneWrapper(Phone phone) {
        super(phone.getName());
        this.original = phone;
    }

    public String getName() {
        return original.getName();
    }

    public void setName(String name) {
        original.setName(name);
    }


}
