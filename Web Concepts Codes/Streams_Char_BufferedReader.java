import java.io.*;

/*
Q2:: In BufferedReader, when we use .readLine() why it returns null at End Of File and not -1 ???
ANS :: Because -1 is at last location where data finishess and thus, this word / char comes in last line which is reading , and for EOF / null it got to see next line which is empty line and not the -1.

hello hello hello hello hello hello hello hello hello helloe hello hello hello
hello hello hello hello hello hello hello hello hello
hello hello hello hello hello hello hello hello hello helloe hello -1

*/

public class Streams_Char_BufferedReader {
    private static void doRead() {

        try {
            BufferedReader in = new BufferedReader(new FileReader("Streams_Byte_FileInputStream.java"));

            String s;

            /*
             * int c = 0;
             * while((c = in.read()) != -1) {
             * System.out.println((char) c); // still need to cast it here in appropriate
             * type
             * }
             * 
             */

            // for reading & writing there are available multiple functions.
            // readLine() is a function of BufferedReader class. It is a special function
            // which reads data line by line. It return complete line (it's return type is
            // string). And it will return null if there is no further line available for
            // reading purpose...
            while ((s = in.readLine()) != null) {
                System.out.println(s);
            }

            in.close();

        } catch (IOException ex) {
            System.out.println("Exception:");
            ex.printStackTrace(); // It gives calling history of where actually exception occurs, Show exception
                                  // history. (Example : If exception occurs in m3(), and we handle it in main
                                  // then by using .printStackTrace() function, we find where actually exception
                                  // occurs.)
        }
    }

    public static void main(String args[]) {
        doRead();
    }
}
