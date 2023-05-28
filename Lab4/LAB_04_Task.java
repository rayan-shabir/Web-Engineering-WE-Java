import java.io.*;
import java.util.*;

class Employee implements Serializable {
    int id;
    String name;
    static double salary;
    String rank;

    public Employee() {
        id = 0;
        name = null;
        salary = 0.0;
        rank = null;
    }

    public Employee(int i, String n, double s, String r) {
        id = i;
        name = n;
        salary = s;
        rank = r;
    }

    public static void loadFromFile(ArrayList AL) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("EmployeeData.csv"));
        int i;
        double s;
        String n, r;

        String line;

        while ((line = br.readLine()) != null) {
            // System.out.println(s);
            System.out.println(line);
            String tokens[] = line.split(",");
            i = Integer.parseInt(tokens[0]);
            n = (tokens[1]);
            s = Double.parseDouble(tokens[2]);
            r = (tokens[3]);

            Employee e = new Employee(i, n, s, r);

            AL.add(e);

            // line = br.readLine();
            // System.out.println(line);
        }
    }

    public static void addToCollection(ArrayList AL) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter id: ");
        int i = inp.nextInt();

        System.out.println("Enter name: ");
        String n = inp.nextLine();

        System.out.println("Enter salary: ");
        double s = inp.nextDouble();

        System.out.println("Enter rank: ");
        String r = inp.nextLine();

        Employee e = new Employee(i, n, s, r);
        AL.add(e);
    }

    public static void writeToFile(ArrayList AL) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"));

        for (int i = 0; i < AL.size(); i++) {
            Employee obj = (Employee) AL.get(i);
            oos.writeObject(obj);

        }
        System.out.println("Save to file successfull...");
    }

    public static void removeFromCollection(ArrayList AL, int id_r) throws Exception {

        for (int i = 0; i < AL.size(); i++) {
            Employee obj = (Employee) AL.get(i);

            if (obj.id == id_r) {
                AL.remove(i);
            }

        }
    }

    public static void display(ArrayList AL) throws Exception {

        for (int i = 0; i < AL.size(); i++) {
            Employee obj = (Employee) AL.get(i);

            System.out.println("Name: " + obj.name);
            System.out.println("ID: " + obj.id);
            System.out.println("Salary: " + obj.salary);
            System.out.println("Rank: " + obj.rank);

        }
    }

}

public class LAB_04_Task {
    public static void main(String args[]) throws Exception {
        ArrayList<Employee> AL = new ArrayList<Employee>();

        System.out.println("LOADING FILE");
        Employee.loadFromFile(AL);

        Scanner inp = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n\n***Menue***");
            System.out.println("1. To Add an employee");
            System.out.println("2. To Remove an employee");
            System.out.println("3. Save to a file");
            System.out.println("3. Display all employees");
            System.out.println("5. EXIT (QUIT)");

            System.out.print("Enter your choice: ");
            choice = inp.nextInt();

            switch (choice) {
                case 1:
                    Employee.addToCollection(AL);
                    break;
                case 2:
                    System.out.println("Enter id to remove: ");
                    int i = inp.nextInt();

                    Employee.removeFromCollection(AL, i);
                    break;
                case 3:
                    Employee.display(AL);
                    break;
                case 4:
                    Employee.writeToFile(AL);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

    }
}
