import java.util.*;

public class Object_of_class {
    public double balance;          // Instace Variable

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {

        // See if the amount can be withdrawn
        if (balance >= amount) {
            balance -= amount;

            return balance;
        } else {
            System.out.println("Withdrawal not allowed...");

            return 0.0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String args[]) {
        System.out.println("***Account***\n");
        Scanner in = new Scanner(System.in);

        // Create an empty account
        Object_of_class my_acc = new Object_of_class();     // Here default Constructor of Object_of_class is called. (If we don't write any constructor in java, Java will provide us a default constructor which has default values like, for numeric data member : 0.0, for string & object : null, for Boolean data member : false, etc.)

        // Deposit money
        System.out.print("Enter the amount that you want to deposit: ");
        double deposit_amount = in.nextDouble();        // Read one line from the console.

        my_acc.deposit(deposit_amount);     

        // Print current balance
        System.out.println("Current balance after deposit the amaount: " + my_acc.getBalance());


        // Withdraw money
        System.out.print("\nEnter amount that you want to withdraw: ");
        double withdraw_amount = in.nextDouble();

        my_acc.withdraw(withdraw_amount);

        System.out.println("Remaining balance after withdrawing the amount is: " + my_acc.getBalance());
    }
}
