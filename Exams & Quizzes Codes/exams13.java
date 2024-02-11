import java.io.*;

public class exams13 {
    int a = 5;

    public exams13(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) throws Exception{
        // System.out.println("Hello Ok");

        System.setOut(new PrintStream("f.txt"));

        System.out.println("Hello Ok");
        exams13 e = new exams13(9);
    }
}
