import java.io.*;

abstract class MyClass {
    int a;
    float b;

    MyClass() {

        System.out.println("I m Parent");
    }

    public void rayan() {
        System.out.println("Rayan");
    }


    public abstract void print();
}



class Child extends MyClass{
    int a;
    float b;

    Child() {
        System.out.println("I m Child");
    }

    public void print() {
        System.out.println("Print");
    }
}


public class exams14 {
    public static void main(String args[]) throws Exception {
        // MyClass m = new MyClass();
        MyClass m2 = new Child();
    }
}
