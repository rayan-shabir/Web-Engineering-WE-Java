import java.io.*;
import java.util.*;

public class LAB_05_Prac_Streams {
    public static void main(String args[]) {
        int count = 0;
        String file1;
        String file2;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter name of file 01: ");
        file1 = inp.nextLine();

        System.out.println("Enter name of file 02: ");
        file2 = inp.nextLine();

        File f1 = new File(file1);
        File f2 = new File(file2);

        if(f1.exists() && f2.exists()) {
            FileInputStream fis1 = null;
            FileInputStream fis2 = null;
            try {
                fis1 = new FileInputStream(file1);
                fis2 = new FileInputStream(file2);

                int data1;
                int data2;

                while((data1 = fis1.read()) != -1) {
                    data2 = fis2.read();

                    if(data1 == data2)
                        count++;
                }
            } catch (Exception ex) {
                System.out.println("Exception: " + ex);
            }
        } else {
            System.out.println("File not exists ");
        }

        long dn = 0;
        if (f1.length() >= f2.length())
            dn = f1.length();
        else 
            dn = f2.length(); 

        System.out.println("Count: " +(count/dn)*100);

    }
}
