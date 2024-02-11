import java.io.*;
import javax.swing.*;

public class Serialization_Transient_Data_Member_Employee implements Serializable{
    public String name;
    public String adress;
    public transient int SSN;
    public int number;

    Serialization_Transient_Data_Member_Employee (String n, String a, int s, int num) {
        name= n;
        adress = a;
        SSN = s;
        number = num;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to: " + name + " " + adress + " at SSN: " + SSN);
    }
}
