import java.util.*;

class Base {
    // void print() {
    //     System.out.println("I am Parent");

    // }
}

class Child extends Base {
    void print() {
        System.out.println("I am Child");
    }
    
    void function() {
        System.out.println("I am Function");

    }
}

public class exams {
    public static void main(String args[]) {
        // Child c = new Child();
        Base c = new Child();

        // c.print();
        c.function();
    }
}
