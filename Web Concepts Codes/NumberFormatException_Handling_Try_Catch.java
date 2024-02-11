import java.util.*;


public class NumberFormatException_Handling_Try_Catch {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.print("Input :: ");
            String str1 = in.nextLine();
            int num = Integer.parseInt(str1);

            System.out.println("Number: " + num);

        } catch (NumberFormatException ex) {
            System.out.println("You have problem in data Conversion:" + ex);
            System.out.println("Exception Message:" + ex.getMessage());
        }
    }
}
