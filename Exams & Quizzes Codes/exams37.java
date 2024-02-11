abstract class A {
    abstract void me();
}

public class exams37 {
    public static void main(String[] args) {
        try {
            try {
                System.out.println("A");
                int num = Integer.parseInt("not an integer");
                System.out.println("B");
            } 
            // catch (NumberFormatException e) {
            //     System.out.println("C");
            //     throw new Exception();
            // } 
            catch (Exception e) {
                System.out.println("D");
                throw e;
            } finally {
                System.out.println("E");
            }
            System.out.println("F");
        } catch (ArithmeticException e) {
            System.out.println("G");
        }
        System.out.println("H");
    }
}
