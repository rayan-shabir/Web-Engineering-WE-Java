import java.io.*;
import javax.swing.*;

public class Serialization_PersonInfo implements Serializable {
    String name;
    String adress;
    String phoneNum;

    // Parametrize Constructor
    public Serialization_PersonInfo(String n, String a, String p) {
        this.name = n;
        this.adress = a;
        this.phoneNum = p;
    }

    // method for displaying PersonInfo on GUI
    public void display() {
        JOptionPane.showMessageDialog(null, "Name: " + name + ", Adress: " + adress + ", Phone Number: " + phoneNum);
    }
}
