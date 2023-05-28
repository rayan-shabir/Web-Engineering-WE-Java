import java.util.*;

class duplicateCustomerException extends Exception {
    public String toString() {
        return "Customer with same ID already exists, Please enter valid ID next time.";
    }
}

class invalidAgeException extends Exception {
    public String toString() {
        return "Customer age cannot be less than 18 and cannot be greater than 65, Please enter valid age next time.";
    }
}

class lowBalanceException extends Exception {
    public String toString() {
        return "Balance value cannot be less than 0. Please enter valid Balance next time";
    }
}

class invalidCustomerIDException extends Exception {
    public String toString() {
        return "Customer with the ID does not exists, Please enter valid ID next time.";
    }
}

class Customer {
    String name;
    String id;
    int age;
    double balance;


    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.age = 0;
        this.balance = 0.0;
    }

    public Customer(String name, String id, int age, double balance) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.balance = balance;
    }

    public void print() {
        System.out.println("Customer Information");
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("Balance: " + this.balance);
    }
}

class Bank {
    ArrayList customers;

    public Bank() {
        customers = new ArrayList();
    }

    public void addCustomer() {
        System.out.println("\nADD");
        Scanner inp = new Scanner(System.in);

        try {
            System.out.println("Enter name of the customer: ");
            String n = inp.nextLine();

            System.out.println("Enter ID of the customer: ");
            String my_id = inp.nextLine();
            // System.out.println("MY ID: " + ii);

            for (int i = 0; i < customers.size(); i++) {
                Customer obj = (Customer) customers.get(i);

                if(my_id.equals(obj.id)) {
                    throw new duplicateCustomerException();
                }

                // try {
                //     Customer obj = (Customer) customers.get(i);

                //     if ((ii).equals(obj.id)) {
                //         throw new duplicateCustomerException();
                //     }

                // } catch (duplicateCustomerException e) {
                //     System.out.println("Exception: " + e);
                // }
            }

            System.out.println("Enter age of the customer: ");
            int a = inp.nextInt();

            if (a < 18 || a > 65)
                throw new invalidAgeException();

            System.out.println("Enter balance of the customer: ");
            double b = inp.nextDouble();

            if (b <= 0)
                throw new lowBalanceException();

            // Customer cust = new Customer(n, my_id);
            Customer cust = new Customer(n, my_id, a, b);

            customers.add(cust);
        } catch (duplicateCustomerException e) {
            System.out.println("Exception: " + e);

        //}
        } catch (invalidAgeException e) {
            System.out.println("Exception: " + e);

        } catch (lowBalanceException e) {
            System.out.println("Exception: " + e);

        }
    }

    public void searchCustomer() {
        System.out.println("\nSEARCH");
        Scanner inp = new Scanner(System.in);

        try {
            int flag = 0;

            System.out.println("Enter ID of the customer: ");
            String ii = inp.nextLine();

            for (int i = 0; i < customers.size(); i++) {
                Customer cust = (Customer) customers.get(i);

                if (ii.equals(cust.id)) {
                    flag = 1;
                    cust.print();
                }
            }

            if (flag == 0)
                throw new invalidCustomerIDException();
        } catch (invalidCustomerIDException e) {
            System.out.println("Exception: " + e);
        }
    }
}

public class Driver {
    public static void main(String[] args) {
        Bank b = new Bank();

        b.addCustomer();
        b.addCustomer();
        // b.addCustomer();

        b.searchCustomer();
    }
}
