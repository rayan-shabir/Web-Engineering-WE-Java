import java.util.Scanner;

public class Non_Static_and_Static_Function {
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
    public static void main(String args[]) {
        System.out.println("***INPUT***");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the integer number: ");
        int a = in.nextInt();

        System.out.println("Enter the float number: ");
        float b = in.nextFloat();

        // Main calling static function
        float res1 = sum(a, b);

        // Main calling non-static function (It will only be done using/creating class object)
        Non_Static_and_Static_Function obj = new Non_Static_and_Static_Function();
        float res2 = obj.subtract(a, b);

        System.out.println("\n***OUTPUT***");

        System.out.println("The Value of '" + a + " + " + b + "' is :: " + res1);
        System.out.println("The Value of '" + a + " - " + b + "' is :: " + res2);
    }
}
