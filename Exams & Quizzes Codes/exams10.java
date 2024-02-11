import java.io.*;

public class exams10 {
    public static void main(String args[]) {
        ObjectOutputStream bout = null;
        Employee e = new Employee("Rayan", "Lahore", 65346, 555, 999123999, "***abc***");

        try {
            bout = new ObjectOutputStream(new FileOutputStream("myFile.txt"));

            bout.writeObject(e);

            e.print();

            bout.close();
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        }
    }
}
