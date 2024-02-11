import java.io.*;
import java.net.*;

public class Socket_Programming_Server_exmp01 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        ServerSocket SS = new ServerSocket(1000);

        System.out.println("Server is waiting for Client Connection");

        Socket s = SS.accept();

        System.out.println("Connection Established....");

        // BufferedStream : only buffer data -> give buffering functionality simply
        // PrintStream: give us functionality of auto flush, In the end it flush the
        // data and write onto stream
        PrintStream f = new PrintStream(s.getOutputStream()); // Here we only wrap getOutputStream into PrintStream: we
                                                              // can also use BufferedOutputStream here for wrapping

        String msg = "Message from server side";

        // As PrintStream is a byte Stream so we convert data into bytes and then write
        // data.
        f.write(msg.getBytes());

        s.close();
    }
}
