public class Exception_Handling_finally_return_statement {
    public static void main(String arg[]) {

        System.out.println("I am going from main..."); // #01
        int v = My_function();
        System.out.println("I am back in main...: " + v);     // #05
    }

    public static int My_function() {
        int num = 5, den = 0;
        try {

            int res = num / den;

        } catch (Exception ex) {
            System.out.println("Outer Catch block");    // #02
            System.out.println("return-1");             // #03

            // System.exit(0);    // programcls termination; here below finally block will not execute

            return 5;               // return by this return but after executing finally block

            // System.exit(0);    // unreachable code, bcz if control comes in catch block then it will never execute because after return which is written above control will find finally block and execute it and tehn return immediately by 'return' written above.
            
        } finally {
            System.out.println("Outer finally block"); // #04
        }

        System.out.println("return-2");         // not execute
        return 5;                               // not execute
    }
}
