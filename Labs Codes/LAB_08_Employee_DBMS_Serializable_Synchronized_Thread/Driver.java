import java.io.*;
import java.util.*;
import java.sql.*;

class Employee implements Serializable {
    String name;
    String department;
    double salary;

    public Employee() {
        this.name = null;
        this.department = null;
        this.salary = 0.0d;
    }

    public Employee(String n, String d, double s) {
        this.name = n;
        this.department = d;
        this.salary = s;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setDepartment(String d) {
        this.department = d;
    }

    public void setSalary(double s) {
        this.salary = s;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}

class FileHandler {
    synchronized public void writeEmp(Employee emp) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("thread_employee.txt"));
            oos.writeObject(emp);
        } catch (IOException ex) {
            System.out.println("Exception1: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception2: " + ex.getMessage());
        }
    }

    synchronized public Employee getEmp(String name) {
        Employee emp = null;

        try {
            FileInputStream fin = new FileInputStream("thread_employee.txt");
            ObjectInputStream oos = new ObjectInputStream(fin);

            while (fin.available() != 0) {
                emp = (Employee) oos.readObject();
                if (emp.getName().equals(name)) {
                    return emp;
                }
            }

        } catch (IOException ex) {
            System.out.println("Exception: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

        return emp;
    }
}

class DBMS {
    synchronized public void selectQuery() {
        Scanner inp = new Scanner(System.in);

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "root");

            Statement st = con.createStatement();

            System.out.println("Enter employee name: ");
            String name = inp.nextLine();

            String query = "select * from myemployee1 where name = '" + name + "' ";

            System.out.println(query);

            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                System.out.println("Name: " + rs.getString("name"));
                System.out.println("Department: " + rs.getString("department"));
                System.out.println("Salary: " + rs.getString("salary"));
            } else {
                System.out.println("No record exist for this select query");

            }

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }

    }

    synchronized public void insertQuery() {
        Scanner inp = new Scanner(System.in);

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/employee", "root", "root");

            Statement st = con.createStatement();

            System.out.println("Enter employee name: ");
            String name = inp.nextLine();
            System.out.println("Enter employee dept: ");
            String dept = inp.nextLine();
            System.out.println("Enter employee salary: ");
            double sal = inp.nextDouble();

            String query = "insert into myemployee1(name, department, salary) values ('" + name + "', '" + dept + "' , "
                    + sal + ")";

            System.out.println(query);

            int rs = st.executeUpdate(query);

            if (rs > 0) {
                System.out.println("One record inserted");
            } else {
                System.out.println("No record inserted");

            }
        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}

class MyThread implements Runnable {
    FileHandler f;
    DBMS db;
    Thread t;
    String func;

    public MyThread(String f) {
        this.db = new DBMS();
        this.f = new FileHandler();
        this.func = f;
        t = new Thread(this);

        t.start();
    }

    // public void run() {
    // Scanner inp = new Scanner(System.in);

    // if(func.equals("write")) {
    // System.out.println("*** Write ***");

    // System.out.println("Enter employee name: ");
    // String name = inp.nextLine();
    // System.out.println("Enter employee dept: ");
    // String dept = inp.nextLine();
    // System.out.println("Enter employee salary: ");
    // double sal = inp.nextDouble();

    // Employee emp = new Employee(name, dept, sal);

    // f.writeEmp(emp);

    // } else if (func.equals("read")) {
    // System.out.println("*** Read ***");

    // System.out.println("Enter employee name: ");
    // String name = inp.nextLine();

    // Employee emp = f.getEmp(name);

    // emp.display();
    // }
    // }

    public void run() {
        Scanner inp = new Scanner(System.in);

        if (func.equals("write")) {
            System.out.println("*** Insert ***");

            db.insertQuery();

        } else if (func.equals("read")) {
            System.out.println("*** Select ***");

            db.selectQuery();
        }
    }
}

public class Driver {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String choice;

        do {
            System.out.println("*** Menue ***");
            System.out.println("-> Do you want to 'read' ?");
            System.out.println("-> Do you want to 'write' ?");
            System.out.println("-> Do you want to 'exit' ?");

            System.out.print(":: Enter your choice: ");
            choice = inp.nextLine();

            if ((!choice.equals("read")) && (!choice.equals("write")) && (!choice.equals("exit"))) {
                System.out.println("Invalid chocie");

            } else if ((choice.equals("read")) || (choice.equals("write"))) {
                MyThread m = new MyThread(choice);

                try {
                    m.t.join();
                } catch (InterruptedException ex) {
                    System.out.println("Exception: " + ex.getMessage());
                }
            }

        } while (!choice.equals("exit"));

        System.out.println("Exiting... ");
    }
}
