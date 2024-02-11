import java.io.*;
import java.net.*;

public class Socket_Programming_Server_Threading {
    public static void main(String args[]) {
        try {
            ServerSocket S = new ServerSocket(2001);

            while(true) {
                Socket s = S.accept();
                
                SThread St = new SThread(s);
                St.start();
            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.toString());
        }
    }
}
