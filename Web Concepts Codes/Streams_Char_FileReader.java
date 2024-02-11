import java.io.*;

// Char Stream : FileOReader->  low level stream

public class Streams_Char_FileReader {
    private static void doRead() {

        try {
            FileReader f = new FileReader("Streams_Byte_FileInputStream.java");
            int ch = 0;

            
            /* -> if we read file in form of characters, By making object of Char stream like::
             FileReader f = new fileReader('filename.txt');

            * Then we also need to cast it with (char), bcz here data is also get in form of bytes, but the main diff with byte stream is that in char stream the data is stored in 2 bytes (in byte stream data is stored in 1 byte).
            */
            
            while((ch = f.read()) > -1) {
                System.out.print((char) ch);
            }

            f.close();

        } catch(IOException ex) {
            System.out.println("Exception:");
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        doRead();
    }
}
