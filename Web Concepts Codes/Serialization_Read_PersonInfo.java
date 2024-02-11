import java.io.*;

public class Serialization_Read_PersonInfo {

    public static void main(String args[]) {
        try {

            // attaching FileInput stream with "ali.txt"
            FileInputStream fis = new FileInputStream("ali.txt");

            // attaching FileInput stream over ObjectInput stream
            ObjectInputStream in = new ObjectInputStream(fis);

            PersonInfo temp;

            while ((temp = (PersonInfo) in.readObject()) != null) {
                temp.printPersonInfo();
            }

            // closing streams
            in.close();
            fis.close();
        } catch (Exception ex) {
            System.out.println("Exception:: " + ex);
        } 
    }// end of main method
} // end class
