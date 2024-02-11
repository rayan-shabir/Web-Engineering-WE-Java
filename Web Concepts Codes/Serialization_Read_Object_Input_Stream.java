import java.io.*;

public class Serialization_Read_Object_Input_Stream {
    public static void main(String args[]) {

        try {
            // attaching file input stream with "objInfo.txt"
            FileInputStream f = new FileInputStream("objInfo.txt");

            // attaching file input stream over Object Input Stream
            ObjectInputStream in = new ObjectInputStream(f);

            // De-Serialization reading object from 'objInfo.txt'
            Serialization_PersonInfo r1 = (Serialization_PersonInfo) in.readObject();
            Serialization_PersonInfo r2 = (Serialization_PersonInfo) in.readObject();

            r1.display();
            r2.display();

            f.close();
            in.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
