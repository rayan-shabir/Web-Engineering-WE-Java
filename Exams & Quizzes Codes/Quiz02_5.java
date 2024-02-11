import java.io.*;

class Base extends Exception{

}

class Child extends Exception {

}

public class Quiz02_5 {
    public static void main(String args[]) {
        try {
            // FileInputStream f = new FileInputStream("null.txt");

            System.out.println("Inside Try");

            throw new Base();

        }  catch (IOException ex) // ERROR, Bcz we are handling exception which is Checked, and this exception not occurs in our try block.
        {
            System.out.println("Inside IO catch");
            
        } catch (Base ex) 
        {
            System.out.println("Inside Custom catch");
            
        }  catch (Exception ex) {
            System.out.println("Inside Exception catch");

        }
    }
}
