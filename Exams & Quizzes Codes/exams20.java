class Base {
    Base() {
        System.out.println("Default Parent Constructor");
    }

    Base(int y) {
        System.out.println("Parametrize  Parent Constructor");
    }
}

class Child extends Base {
    Child() {
        this(5);
        System.out.println("Default Constructor");
    }

    Child(int y) {
        System.out.println("Parametrize Constructor");
    }
}



public class exams20 {
    public static void main(String args[]) {
        System.out.println("Before Try");
        try {
            Child c = new Child();

        } catch(Exception ex) {
            System.out.println(ex);
        }
    }
}
