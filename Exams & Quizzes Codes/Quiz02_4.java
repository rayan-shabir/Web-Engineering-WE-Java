import java.io.*;

class Base extends Exception{

}

class Child extends Exception {

}

public class Quiz02_4 {
    public static void main(String args[]) {
        try {
            FileInputStream f = new FileInputStream("null.txt");

            System.out.println("Inside Try");

            // throw new myCustomException();

        }  catch (IOException ex) {
            System.out.println("Inside IO catch");
            
        } catch (Base ex)  // ERROR, Bcz we are handling exception which is checked (Custom), and this exception not occurs in our try block. (So we can only handle checked / custom exceptions when they are occur in try blocks.) Otherwise if we write their catch block, then it would be an error.
        {
            System.out.println("Inside Custom catch");
            
        }  catch (Exception ex) {
            System.out.println("Inside Exception catch");

        }
    }
}
