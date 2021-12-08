package Classes_and_Object.BookShild;

public class TestBook {

    public static void main(String[] args) {
        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        for(int i = 0; i < 10;i++) {
            stack1.push(i);
            stack2.push(i*2);
        }

        System.out.println("Coдepжимoe стека stack1 : " );
        for(int i = 0; i < 10; i++){
            System.out.println(stack1.pop());
        }
        System.out.println("Coдepжимoe стека stack2 : " );
        for(int i = 0; i < 10; i++){
            System.out.println(stack2.pop());
        }
    }
}

class Stack {
    private int stck[] = new int[10];
    private int tos;

    Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack are full");
        } else {
            stck[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("Stack are not full");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

