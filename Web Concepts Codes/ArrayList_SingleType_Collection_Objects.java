// Topic:: Collection Objects; Single Specific Type ArrayList 
import java.util.*;

public class ArrayList_SingleType_Collection_Objects {
    public double balance;      // Instance variable

    // Default Constructor for empty balance
    public ArrayList_SingleType_Collection_Objects() {
        balance = 0.0;
    }

    // Parametrize Conctructor to initialize balance
    public ArrayList_SingleType_Collection_Objects(double amount) {
        balance = amount;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double withdraw(double amount) {
        return balance -= amount;
    }

    public double getBalance() {
        return this.balance;
    }


    public static void main(String args[]) {
        ArrayList_SingleType_Collection_Objects obj1 = new ArrayList_SingleType_Collection_Objects();
        ArrayList_SingleType_Collection_Objects obj2 = new ArrayList_SingleType_Collection_Objects(1000.0);
        ArrayList_SingleType_Collection_Objects obj3 = new ArrayList_SingleType_Collection_Objects();
        // ArrayList_SingleType_Collection_Objectsobj4 = new ArrayList_SingleType_Collection_Objects();

        // System.out.println("Balance" + obj1.getBalance());
        // System.out.println("Balance" + obj2.getBalance());
        // System.out.println("Balance" + obj3.getBalance());

        

        // Create an ArrayList and add items
        ArrayList<ArrayList_SingleType_Collection_Objects> bank = new ArrayList<ArrayList_SingleType_Collection_Objects>();
        bank.add(obj1);
        bank.add(obj2);
        bank.add(obj3);

        int size = bank.size();

        System.out.println("\nSize of ArrayList before deletion is : " + size);
        
        int index = 0;
        // Retrieve items from ArrayList
        while(index < (size-1)) {
            System.out.println("Index : " + index);

            ArrayList_SingleType_Collection_Objects obj = bank.get(index);
            double bal = obj.getBalance();
            // System.out.println("Balance" + bal);


            // Removal of items inside the ArrayList
            if (bal <= 0) {
                System.out.println("Deleting. Index.." + index);
                bank.remove(index);
            }
            index++;
        }
        
        System.out.println("Size of ArrayList after deletion is : " + bank.size());
    }
}
