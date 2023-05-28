import java.io.*;
import java.util.*;


// EMPLOYEE CLASS
class Employee implements Serializable {
    int id;
    String name;
    static double salary;
    String rank;


    // No arg Constructor
    public Employee() {
        id = 0;
        name = null;
        salary = 0.0d;
        rank = null;
    }


    // Parametrize Constructor
    public Employee(int id, String name, double salary, String rank) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.rank = rank;
    }


    // LOADING DATA FROM csv FILE
    public static void loadFromFile(ArrayList<Employee> AL) throws Exception {
        int id;
        double salary;
        String name, rank;

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("EmployeeData.csv"));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[] tokens = line.split(",");

                id = Integer.parseInt(tokens[0]);
                name = (tokens[1]);
                salary = Double.parseDouble(tokens[2]);
                rank = (tokens[3]);

                Employee emp = new Employee(id, name, salary, rank);

                AL.add(emp);
            }

            System.out.println("\"Successfully Loaded employee's information form csv file\"");

        } catch (IOException ex) {

            System.out.println("IOException: " + ex);

        } catch (Exception ex) {

            System.out.println("Exception: " + ex);

        } finally {

            try {
                br.close();
            } catch (Exception ex) {
                System.out.println("Exception: Issue at closing the file");
            }
        }
    }


    // ADDING OBJECTS TO COLLECTION
    public static void addToCollection(ArrayList<Employee> AL) throws Exception {
        Scanner inp = new Scanner(System.in);
        String name, rank, enter;
        int id;
        double salary;

        System.out.println("*** Give Employee's Information ***");

        System.out.print("Enter id: ");
        id = inp.nextInt();
        enter = inp.nextLine();

        System.out.print("Enter name: ");
        name = inp.nextLine();

        System.out.print("Enter salary: ");
        salary = inp.nextDouble();
        enter = inp.nextLine();

        System.out.print("Enter rank: ");
        rank = inp.nextLine();

        Employee emp = new Employee(id, name, salary, rank);
        AL.add(emp);
    }


    // SAVE COLLECTION TO FILE
    public static void writeToFile(ArrayList<Employee> AL) {
        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));

            if (AL.size() > 0) {

                for (int i = 0; i < AL.size(); i++) {
                    Employee obj = (Employee) AL.get(i);

                    oos.writeObject(obj);
                }

                System.out.println("\" Successfully, Saved Collection objects to 'employee.txt' File.... \"");

            } else {
                System.out.println("\" No object exists in Collection to write into File. \"");
            }

        } catch (IOException ex) {

            System.out.println("IOException: " + ex);

        } catch (Exception ex) {

            System.out.println("Exception: " + ex);

        } finally {

            try {
                oos.close();
            } catch (Exception ex) {
                System.out.println("Exception: Issue at closing the file");
            }
        }
    }


    // REMOVE OBJECT
    public static void removeFromCollection(ArrayList<Employee> AL, int id_rem) throws Exception {
        boolean flag = false;

        for (int i = 0; i < AL.size(); i++) {
            Employee obj = (Employee) AL.get(i);

            if (obj.id == id_rem) {
                flag = true;
                AL.remove(i);
            }
        }

        if (!flag)
            System.out.println("\"No Employee exists with ID: " + id_rem + " to remove.\"");
        else
            System.out.println("\"Employee with ID: " + id_rem + " removed successfully...\"");

    }


    // DSIPLAY COLLECTION
    public static void display(ArrayList<Employee> AL) throws Exception {

        if (AL.size() == 0) {
            System.out.println("\"No Employee exists in the Organization...\"");

        } else {
            for (int i = 0; i < AL.size(); i++) {
                System.out.println("\nEmployee: " + (i + 1));
                Employee obj = (Employee) AL.get(i);

                System.out.println("Name: " + obj.name);
                System.out.println("ID: " + obj.id);
                System.out.println("Salary: " + obj.salary);
                System.out.println("Rank: " + obj.rank);
            }
        }
    }

}


// DRIVER CLASS
public class Driver {
    public static void main(String args[]) throws Exception {
        ArrayList<Employee> AL = new ArrayList<Employee>();

        System.out.println("*** LOADING DATA FROM csv FILE ***");
        Employee.loadFromFile(AL);

        Scanner inp = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\n*** Menue ***");
            System.out.println("1. To ADD an employee to organization.");
            System.out.println("2. To REMOVE an employee from organization.");
            System.out.println("3. DISPLAY all employees information.");
            System.out.println("4. To SAVE all employee's information to a 'txt' file.");
            System.out.println("5. EXIT (QUIT)");

            System.out.print("\nEnter your choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n /// ADD TO Collection \\\\\\");
                    Employee.addToCollection(AL);

                    break;
                case 2:
                    System.out.println("\n /// REMOVE From Collection \\\\\\");
                    System.out.println("Enter id to remove: ");
                    int id = inp.nextInt();

                    Employee.removeFromCollection(AL, id);

                    break;
                case 3:
                    System.out.println("\n /// DISPLAY Collection \\\\\\");
                    Employee.display(AL);

                    break;
                case 4:
                    System.out.println("\n /// SAVE Collection to File \\\\\\");
                    Employee.writeToFile(AL);

                    break;
                case 5:
                    System.out.println("Thankyou! Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

    }
}
