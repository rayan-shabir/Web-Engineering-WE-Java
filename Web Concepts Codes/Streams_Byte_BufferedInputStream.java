import java.io.*;


class Streams_Byte_BufferedInputStream {
    public static void main(String args[]) {
        FileInputStream fin = null;
        BufferedInputStream bin = null;

        try {
            fin = new FileInputStream("Streams_Byte_FileInputStream.java");      // low level stream
            bin = new BufferedInputStream(fin);                                 // high level stream
            int ch = 0;

            while((ch = bin.read()) > -1) {
                System.out.print((char) ch);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}