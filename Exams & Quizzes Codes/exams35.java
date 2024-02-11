import java.util.*;

class Base {
    public int a;
    Scanner inp = new Scanner(System.in);

    public void read1() {
        System.out.println("Base read: ");
        a = inp.nextInt();
    }
}

class Child extends Base {
    public int b;

    public void read2() {
        System.out.println("Child read: ");
        b = inp.nextInt();
    }
}
public class exams35 {
    public static void main(String args[]) {
        Base b = new Base();
        Child c = new Child();

        b.read1();
        c.read2();

        System.out.println(b.a);
        System.out.println(c.b);
    }
}
