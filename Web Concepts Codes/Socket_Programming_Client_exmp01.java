import java.io.*;
import java.net.*;


public class Socket_Programming_Client_exmp01 {
    public static void main(String args[]) throws IOException, ClassNotFoundException {
        Socket s = new Socket("127.0.0.1", 1000); // it will send a request to our server

        BufferedReader bin = new BufferedReader(new InputStreamReader(s.getInputStream())); // InputStreamReader : is
                                                                                            // like a bridge which will
                                                                                            // take data in form of
                                                                                            // bytes and convert it into
                                                                                            // character

        // BufferedInputStream bin = new BufferedInputStream(s.getInputStream());

        System.out.println(bin.readLine());

        bin.close();

        s.close();
    }
}
