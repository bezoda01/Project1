package Classes_and_Object;

public class Programmer {
    private int salary = 1000;

    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary = salary > this.salary ? salary : this.salary;
    }

    public void info(int salary){
        System.out.println(salary);
    }
    public Programmer(){
        setSalary(1);
        info(getSalary());
    }

    public static void main(String[] args) {
        Programmer programmer = new Programmer();
    }
}
