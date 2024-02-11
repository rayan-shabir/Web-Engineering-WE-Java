import java.io.BufferedInputStream;
import java.next.*;

public class Socket_Programming_Client_exmp02 {
    public Socket_Programming_Client_exmp02() {
        for (int i = 0; i < 5; i++) {
            
            try {
                Socket s = new Socket("127.0.0.1", 8001);

                if(s != null) {
                    BufferedReader f = new BufferedReader(new InputStreamReader(s.getInputStream()));

                    f.readLine();
                    s.close();
                }

                
            } catch (Exception ex) {

            }
        }
    }
}
