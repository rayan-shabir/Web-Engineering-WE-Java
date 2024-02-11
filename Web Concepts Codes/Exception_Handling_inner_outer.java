public class Exception_Handling_inner_outer {
    public static void main(String arg[]) {
        int num = 5, den = 0;
        try {

            try {
                int res = num / den;

            } catch (ArithmeticException ex) {
                int m_res = num / den;
                System.out.println("Inner Catch block");  // not run
            } catch(Exception e) {
                System.out.println("Inner 2 Catch block");  // not run
                
            }finally {
                System.out.println("Outer finally block"); // #02
            }

        } catch (Exception ex) {
            System.out.println("Outer Catch block"); // #01
        } finally {
            System.out.println("Outer finally block"); // #02
        }
    }
}
