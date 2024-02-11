import java.io.*;

// Byte Stream : FileOutputStream  ->  low level stream


public class Streams_Byte_FileOutputStream {
    public static void main(String[] args) {
        String s = new String("Another Line to write");
        FileOutputStream f = null;

        try {
            f = new FileOutputStream("test.txt");       // If file not exists it will create a new file
            byte buf[] = s.getBytes();  // converting string into appropriate bytes, So we can write easily byte by byte into file (bcz we opened connection for byte writing) [.getBytes() return appropriate bytes in form of array for given string]. 

            for(int i = 0; i < buf.length; i++) {
                f.write(buf[i]);            // this function only accept bytes to write
            }
            System.out.println("Successfully written in file...");
            f.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
