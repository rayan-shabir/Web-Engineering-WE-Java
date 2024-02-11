import java.io.*;


public class exams8 {

    public static void main(String args[]) {
        try (FileWriter fos = new FileWriter("eximi.txt", true);

                BufferedWriter out = new BufferedWriter(fos)) {

            // serialization writing object to ‘ali.txt’
            out.write("I am Rayan 1");
            out.write("I am Rayan 2");

        } catch (Exception ex) {
            System.out.println(ex);
        }

    } // end main method

} // end class
