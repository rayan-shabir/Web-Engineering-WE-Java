import javax.swing.*;

public class Overloading {
    private static double getDouble(String prompt) {
        String tempStr;
        tempStr = JOptionPane.showInputDialog(prompt);

        return Double.parseDouble(tempStr);
    }

    private static double getDouble(String prompt, double low, double high) {
        double val;
        String tempStr = prompt + ": Value must be in range " + low + " to " + high;

        do {
            val = getDouble(tempStr);
        } while(val < low || val > high);

        return val;
    }

    private static void display(String output) {
        JOptionPane.showMessageDialog(null, output);
    }

    public static void main(String args[]) {
        double n1 = getDouble("Enter 1st number ");
        double n2 = getDouble("Enter 2nd number ", 0.0, 100.0);

        double avrg = (n1 + n2) / 2;

        display("Average: " + avrg);
    }

}
