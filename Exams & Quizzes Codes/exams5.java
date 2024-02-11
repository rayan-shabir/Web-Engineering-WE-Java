import java.io.*;

public class exams5 {
    public static void main(String args[]) throws IOException
    {
        char c;
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter 'q' to esit.");

        do {
            c = (char) inp.read();
            System.out.println(c);
        } while(c != 'q');
    }
}
