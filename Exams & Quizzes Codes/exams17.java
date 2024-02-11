class C {}
// class B {}

class B extends C {}

// class D extends B {}

class A {
    B b = new B();
    C c = (C) b;
}

public class exams17 {
    public static void main(String args[]) {
        boolean var = false;

        if (var = true)
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        A a = new A();
    }
}
