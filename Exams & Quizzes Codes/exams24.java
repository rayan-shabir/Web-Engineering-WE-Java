import java.io.*;

public class exams24 {

    public void File_func() {
        BufferedReader br = null;
        // BufferedWriter bw = null;
        PrintWriter pw = null;


        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("f.txt")));
            // bw = new BufferedWriter(new FileWriter("f2.txt"));
            pw = new PrintWriter(new FileWriter("f3.txt"));

            String line;

            while((line = br.readLine()) != null) {
                System.out.println(line);
                
                // bw.write(line);

                pw.println(line);
            }

            System.out.println("Successfully written into file");

        } catch (IOException ex) {
            System.out.println("Exception: IOException");
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        finally {
            try {
                br.close();
                // bw.close();
                pw.close();
            } catch (Exception ex) {
                System.out.println("Exception: File Closing issue..." );

            }
        }
    }
    public static void main(String args[]) throws Exception{
        (new exams24()).File_func();
    }
}
