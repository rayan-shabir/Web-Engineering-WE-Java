import java.util.*;
import java.io.*;
import java.io.File;

public class exams33 {
    public static void main(String args[]) {
        int count = 0;

        try {
            File f1 = new File("f.txt");
            File f2 = new File("f1.txt");

            Scanner reader1 = new Scanner(f1);
            Scanner reader2 = new Scanner(f2);

            while(reader1.hasNextLine()) {
                String data1 = reader1.next();
                String data2 = reader2.next();

                if(data1.equals(data2))
                    System.out.println("Line:  " + data1);
                    count++;
            }


            System.out.println("Count:  " + count);
            reader1.close();
            reader2.close();
        } catch (IOException ex) {
            System.out.println("Exception: " + ex);
        } catch (Exception ex) {
            // System.out.println("Exception: " + ex);
            
        }
        System.out.println("Count:  " + count);
    }
}
