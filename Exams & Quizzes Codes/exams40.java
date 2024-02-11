import java.util.*;

abstract class A {
    int a;

    A () {
        System.out.println("A constructor");
    }

    void show() {
        
    }
}

class B extends A{
    int a;

    B () {
        System.out.println("B constructor");
    }
}

class C extends B{
    int a;

    C () {
        System.out.println("C constructor");
    }

    void show() {
        
    }
}

public class exams40 {
    // declaring the instance variable
    protected double radius;

    public static void main(String args[]) {
        C c = new C();
    }
}

