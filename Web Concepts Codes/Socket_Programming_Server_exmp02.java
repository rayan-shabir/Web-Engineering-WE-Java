import java.net.*;
import java.util.*;
import java.io.*;

public class Socket_Programming_Server_exmp02 {
    public Socket_Programming_Server_exmp02() {
        Socket s = null;

        try {
            ServerSocket S = new ServerSocket(8001);
        
            while (true) {

                try {
                    // System.out.println("Waiting for Client Connection...");
                    s = S.accept();

                    System.out.println("Connection.Established..");

                    // BufferedOutputStream bin = new BufferedOutputStream(s.getOutputStream());
                    PrintStream bin = new PrintStream(s.getOutputStream());

                    Date nowDate = new Date();

                    bin.write(nowDate.toString().getBytes());

                    bin.close();
                    // s.close();
                } catch (Exception ex) {
                    ex.getMessage();
                    S = null;
                    
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public static void main(String args[]) {
        Socket_Programming_Server_exmp02 obj = new Socket_Programming_Server_exmp02();
    }
}
