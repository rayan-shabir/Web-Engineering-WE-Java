import java.util.Scanner;

public class String_Input_and_Functions {

    // Static Function
    static float sum(int a, float b) {
        float c = a + b;

        return c;
    }

    // Non-Static Function
    float subtract(int a, float b) {
        float c = a - b;

        return c;
    }

    public static void main(String[] args) {
        System.out.println("***INPUT***");
        Scanner in = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int a = in.nextInt();

        System.out.print("Enter Float number: ");
        float b = in.nextFloat();

        System.out.print("Enter a Word: ");
        String s1 = in.next(); // It Reads One Word Only

        // InputStream.skip();

        
        String enter = in.nextLine(); // To accept ENTER

        System.out.print("Enter a Line: ");
        String s2 = in.nextLine(); // It Reads Full Line

        System.out.println("***OUTPUT***");

        System.out.println("The Word you entered is : " + s1);

        System.out.println("The Line you entered is : " + s2);
        // Main calling static function
        float c1 = sum(a, b);
        System.out.println("Value of a + b is : " + c1);

        // Main calling non-static function (It will only be done using/creating class
        // object)
        String_Input_and_Functions obj = new  String_Input_and_Functions();

        float c2 = obj.subtract(a, b);
        System.out.println("Value of a - b is : " + c2);
    }

}
