import java.io.*;
import java.io.IOException;

class NewException extends Exception {
    int val;

    NewException(int v) {
        val = v;
    }

    public String toString() {
        return "NewException " + val;
    }
}

public class exams2 {
    public static void main(String args[]) {
        try {
            // FileWriter f = new FileWriter("ext.txt", true);
            // f.write("a");

            doWork(2);
            doWork(1);
            doWork(0);
        } catch (NewException ex) {
            System.out.println("Exception: " + ex);
        } 
        catch (IOException ex) {

        }
    }

    public static void doWork(int val) throws NewException, ArithmeticException, IOException{
        // FileWriter f = new FileWriter("ext.txt", true);
        // f.write("a");

        if (val == 0)
            throw new NewException(val);
        else
            System.out.println("No Problem...");
    }

}
