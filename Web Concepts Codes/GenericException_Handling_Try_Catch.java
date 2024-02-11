/*
* try, catch block handles exception where it is occured.

By default when we print object it will simply call its toString function of that class. (As we do not write this toString function by ourself. So, we got this function which is written in java.lang.Object class.)
to String() -> java.lang.Object

toString : 
*/

public class GenericException_Handling_Try_Catch {
    static int num = 34;
    static int den = 0;
    static int quot = 0;
    public static void main(String args[]) {
        try {
            quot = num / den;

        } catch (Exception ex)      // Exception ex = new ArithmeticException();        // up-casting / Implicit Casting
                                    // Exception ex = new IOException();
        {                           // Exception ex = new SQLException();
            System.out.println("Error in the code");
            System.out.println("Exception: " + ex);     // Here toString function of ArithmeticException class will be called. Bcz Exception is of type : Arithmetic exception here.
        }
    }
}
