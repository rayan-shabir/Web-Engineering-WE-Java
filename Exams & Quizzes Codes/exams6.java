import java.io.*;

public class exams6 {
    public static void main(String args[]) throws IOException
    {
        String c;
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 'stop' to esit.");

        do {
            c = inp.readLine();
            System.out.println(c);
        } while(!c.equals("stop"));
    }
}
