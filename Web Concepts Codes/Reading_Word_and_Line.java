import java.util.Scanner;


public class Reading_Word_and_Line {
    public static void main(String args[]) {
        System.out.println("***INPUT***");
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a Word: ");
        String word = in.next();   // It Reads One Word Only

        // InputStream.skip();

        String enter = in.nextLine();   // To accept ENTER

        System.out.println("Enter a Line: ");
        String line = in.nextLine();  // It Reads Full Line

        System.out.println("\n***OUTPUT***");

        System.out.println("Your Word is:: " + word);
        System.out.println("Your Line is:: " + line);
    }
}
