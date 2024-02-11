// import java.util.*;     // To import every class inside 'util' folder (package)
import java.util.Scanner;   // To import only 'Scanner' class inside 'util' folder (package)


// input.nextLine();   // read data line by line
// input.nextInt();    // return type -> int
// input.nextDouble(); // return type -> double

public class User_Input_Console{

    public static void main(String args[]) {
        String degree, batch, section, id;

        // 'Scanner' is a class whose functions (nextLine(), nextInt(), nextDouble()) are not static, that's why we have to create an object for Scanner class to get/access them (these Function).

        Scanner in = new Scanner(System.in);

        System.out.println("What's your Degree?");
        degree = in.nextLine();                         // read one line from console

        System.out.println("What's your Batch?");
        batch = in.nextLine();                          // read one line from console

        System.out.println("What's your Section?");
        section = in.nextLine();                        // read one line from console

        System.out.println("What's your ID?");
        id = in.nextLine();                             // read one line from console
        
        System.out.println("Enter some byte: ");
        byte b = in.nextByte();                             // read byte from console

        System.out.println("\nByte: " + b);


        // Displaying output
        System.out.println("\nYour Roll No is:: " + degree + batch + section + id);
        
        
        System.out.println("Enter number: ");
        int n1 = in.nextInt();                             // read integer from console

        System.out.println("\nNumber is:: " + n1);


        in.close();
    }
}