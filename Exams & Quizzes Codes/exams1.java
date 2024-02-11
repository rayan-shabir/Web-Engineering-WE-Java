import java.util.*;

public class exams1 {
    public static void main(String args[]) {
        int x = 0;
        System.out.println("I am x: " + x);
        Scanner inp = new Scanner(System.in);


        String s = inp.nextLine();
        int i = inp.nextInt();

        try{

        }
        finally {
            System.out.println("Value inside finally 1");
        }
        finally {
            System.out.println("Value inside finally 2");
        }
        finally {
            System.out.println("Value inside finally 3");
        }
    }
}
