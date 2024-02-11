import java.io.*;

public class Serialization_Reading_and_Writing_transient_data_member_example {
    public static void main(String args[]) {
        Serialization_Transient_Data_Member_Employee obj = new Serialization_Transient_Data_Member_Employee("Rayan", "Australia", 535, 12345);

        try {
            // For writing
            // FileOutputStream fin = new FileOutputStream("transient.txt");
            // ObjectOutputStream in = new ObjectOutputStream(fin);
            // in.writeObject(obj);
            // System.out.println("Successfuly Write.");

            // For reading
            FileInputStream fin = new FileInputStream("transient.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Serialization_Transient_Data_Member_Employee o1 = (Serialization_Transient_Data_Member_Employee) in.readObject();
            o1.mailCheck();

            fin.close();
            in.close();


        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
