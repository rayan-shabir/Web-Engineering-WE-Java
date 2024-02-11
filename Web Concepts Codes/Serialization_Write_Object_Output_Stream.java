 /*
Serialization:: is a process of saving the state of an object into a stream. (As, stream is connected with an end point, thus, here serialization means we are goint to write / read state of object on some file or console or computer).

De-Serialization :: How we retrive the state of an object. (Means if we already  save the state of an object then how we get back this state into RAM, this process is known as De-Sreialization.) How we retrive object from file.
*/      

import java.io.*;

public class Serialization_Write_Object_Output_Stream {
    public static void main(String args[]) {
        Serialization_PersonInfo obj1 = new Serialization_PersonInfo("Rayan", "Gujrat", "03075035899");
        Serialization_PersonInfo obj2 = new Serialization_PersonInfo("Ali", "Lahore", "030752725899");
        Serialization_PersonInfo obj3 = new Serialization_PersonInfo("Shahmeer", "Zoo", "737875035899");

        try {
            // attaching FileOutputStream with objInfo.txt
            FileOutputStream f = new FileOutputStream("objInfo.txt");

            // attaching ObjectOutputStream over FileOutputStream
            ObjectOutputStream out = new ObjectOutputStream(f);
            
            // serialization, writing object to "objInfo.txt"
            out.writeObject(obj1);
            out.writeObject(obj2);
            out.writeObject(obj3);
            
            System.out.print("Successfully written...");

            f.close();
            out.close();
        } catch(IOException ex) {
            System.out.print("IOException: " + ex.getMessage());
        }


    }
    
}
