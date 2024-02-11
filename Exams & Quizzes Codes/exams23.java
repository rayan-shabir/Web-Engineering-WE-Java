import java.io.*;

public class exams23 {

    public void File_func() {
        BufferedInputStream bin = null;
        BufferedOutputStream bos = null;


        try {
            bin = new BufferedInputStream(new FileInputStream("f.txt"));
            bos = new BufferedOutputStream(new FileOutputStream("f1.txt"));

            int data;

            while((data = bin.read()) != -1) {
                System.out.println((char) data);
                
                bos.write(data);
            }

            System.out.println("Successfully written into file");

        } catch (IOException ex) {
            System.out.println("Exception: IOException");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        finally {
            try {
                bin.close();
                bos.close();
            } catch (Exception ex) {
                System.out.println("Exception: File Closing issue..." );

            }
        }
    }
    public static void main(String args[]) throws Exception{
        (new exams23()).File_func();
    }
}
