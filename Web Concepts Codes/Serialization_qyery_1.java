import java.io.*;

public class Serialization_qyery_1 {
    public static void main(String args[]) {

        try {
            // attaching file input stream with "objInfo.txt"
            FileInputStream f = new FileInputStream("objInfo.txt");

            // attaching file input stream over Object Input Stream
            ObjectInputStream in = new ObjectInputStream(f);

            // De-Serialization reading object from 'objInfo.txt'
            Employee r1 = (Employee) in.readObject();
            Employee r2 = (Employee) in.readObject();

            r1.print();
            r2.print();

            f.close();
            in.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
