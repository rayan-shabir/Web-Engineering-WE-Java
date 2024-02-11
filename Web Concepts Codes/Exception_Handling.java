public class Exception_Handling {
    public static void main(String arg[]) {

        System.out.println("I am going from main...");
        int v = My_function();
        System.out.println("I am back in main...");
    }

    public static int My_function() {
        int num = 5, den = 0;
        try {

            int res = num / den;

        } catch (Exception ex) {
            System.out.println("Outer Catch block"); // #02
            return 5;
            
        } finally {
            System.out.println("Outer finally block"); // #03
        }

        return 5;
    }
}
