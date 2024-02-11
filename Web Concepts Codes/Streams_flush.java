import java.io.*;

public class Streams_flush {
    public static void main(String[] args) {
        String s = "Hello World";

        // create a new writer
        
        try {
            PrintWriter writer = new PrintWriter(System.out);
            // append a string
            writer.append(s);

            // flush the writer
            writer.flush();

            // append a new string in a new line
            writer.append("\nThis is an example");

            writer.println("\nThis is an example 22");

            // flush the stream again
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}