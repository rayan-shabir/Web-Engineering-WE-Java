 /*
Serialization:: is a process of saving the state of an object into a stream. (As, stream is connected with an end point, thus, here serialization means we are goint to write / read state of object on some file or console or computer).

De-Serialization :: How we retrive the state of an object. (Means if we already  save the state of an object then how we get back this state into RAM, this process is known as De-Sreialization.) How we retrive object from file.
*/      

import java.io.*;

public class Serialization_query_2 {
    public static void main(String args[]) {
        Employee obj1 = new Employee("Rayan", "Gujrat", 1, 2, 3, "03075035899");
        Employee obj2 = new Employee("Shabbir", "Lahore", 33, 98, 32, "030750");

        try {
            // attaching FileOutputStream with objInfo.txt
            FileOutputStream f = new FileOutputStream("objInfo.txt");

            // attaching ObjectOutputStream over FileOutputStream
            ObjectOutputStream out = new ObjectOutputStream(f);
            
            // serialization, writing object to "objInfo.txt"
            out.writeObject(obj1);
            out.writeObject(obj2);
            
            System.out.print("Successfully written...\n");

            f.close();
            out.close();

            obj1.print();
            obj2.print();
        } catch(IOException ex) {
            System.out.print("IOException: " + ex.getMessage());
        }


    }
    
}
