import java.util.*;

public class Perfect_Number {
    public static void main(String args[]) {
        String s = "";
        System.out.println("Input: ");
        Scanner inp = new Scanner(System.in);

        int num = inp.nextInt();

        for(int i = 1; i < num; i++) {
            if(num % i == 0) {
                s = s + i + ",";
            }
        }

        int sum = 0;
        String tokens[] = s.split(",");

        for(int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
            sum = sum + Integer.parseInt(tokens[i]);
        }

        if(sum == num && ((sum + num) / 2) == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is NOT a Perfect Number");
        }
    }
}
