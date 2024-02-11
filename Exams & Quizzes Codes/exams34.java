import java.io.*;

public class exams34 {

    public void File_func() {
        BufferedInputStream bin1 = null;
        BufferedInputStream bin2 = null;
        int count = 0;

        try {
            bin1 = new BufferedInputStream(new FileInputStream("f.txt"));
            bin2 = new BufferedInputStream(new FileInputStream("f1.txt"));

            int data1;
            int data2;

            while(((data1 = bin1.read()) != -1) && ((data2 = bin2.read()) != -1)) {
                // System.out.println("Data1: " + (char) data1);
                // System.out.println("Data2: " + (char) data2);
                
                if(data1 == data2)
                    count++;
            }

        } catch (IOException ex) {
            System.out.println("Exception: IOException");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        finally {
            try {
                bin1.close();
                bin2.close();
            } catch (Exception ex) {
                System.out.println("Exception: File Closing issue..." );
                
            }
        }

        System.out.println("Count: " + count);
    }
    public static void main(String args[]) throws Exception{
        (new exams34()).File_func();
    }
}
