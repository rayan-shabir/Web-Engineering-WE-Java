class A{

}

class B{

}

class C extends A {

}

class D extends A {
    
}

public class exams7 {
    public static void main(String args[]) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

        if (a instanceof A) System.out.println("a instance of A"); //
        if (b instanceof B) System.out.println("b instance of B"); //
        if (c instanceof A) System.out.println("c instance of A");//

        if (a instanceof C) System.out.println("a instance of C");

        A ob;
        ob = d;

        if(ob instanceof D) System.out.println("ob instance of D");//
        if(ob instanceof A) System.out.println("TRUE::: ob instance of A");//


        A ob1 = new C();
        C objj1 = (C)ob1;

        if(objj1 instanceof C) System.out.println("objj1 instance of C");//

        ob = c;
        if(ob instanceof D) System.out.println("Now:: ob instance of C");
        if(ob instanceof A) System.out.println("Now:: ob instance of AAAA");//

    }

}
