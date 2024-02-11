import java.io.*;

public class exams9 {
    public static void main(String args[]) {
        ObjectInputStream bin = null;

        try {
            bin = new ObjectInputStream(new FileInputStream("myFile.txt"));

            Employee e = (Employee) bin.readObject();
            e.print();

            bin.close();
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
